package com.horvan.trial.repository;

import com.horvan.trial.Constant;
import com.horvan.trial.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = Constant.TABLE_USER, path = "user")
public interface UserRepository extends PagingAndSortingRepository<User,Long>{

    @RestResource( path = "login",rel = "login" ,exported = true)
    @Description("登录接口测试")
    List<User> findByUsernameAndPassword(@Param("username") String username ,@Param("password") String password);

//    boolean loginMethod(@Param("username") String username ,@Param("password") String password);
}

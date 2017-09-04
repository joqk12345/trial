package com.horvan.trial.repository;

import com.horvan.trial.Constant;
import com.horvan.trial.entity.HotWord;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = Constant.TABLE_HOTWORD,path = "hotword")
public interface HotWordRepository extends PagingAndSortingRepository<HotWord,Long> {

    @RestResource(path = "names")
    HotWord  findByName(String name);

}

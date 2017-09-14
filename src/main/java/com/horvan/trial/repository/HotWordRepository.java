package com.horvan.trial.repository;

import com.horvan.trial.Constant;
import com.horvan.trial.entity.HotWord;
import com.horvan.trial.entity.TrialCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = Constant.TABLE_HOTWORD, path = "hotword")
public interface HotWordRepository extends PagingAndSortingRepository<HotWord, Long> {

    @Query(value = "select * from hot_word h where h.name = :name and h.type = :type AND  h.state = :status ORDER BY h.id DESC \n#pageable\n",
            countQuery = "select * from hot_word h where h.name = :name and h.type = :type AND  h.state = :status ORDER BY h.id DESC \n#pageable\n",
            nativeQuery = true)
    @RestResource(path = "findByName",exported = true )
    Page<HotWord> findByName(@Param("name")  String name,@Param("type")  @RequestParam(value = "type", defaultValue = "1")  String type, @Param("status")  @RequestParam(value = "status", defaultValue = "2")  String status, Pageable pageable);

    @Query(value = "select * from hot_word h where h.type = :type and  h.state = :status ORDER BY h.id DESC \n#pageable\n",
            countQuery = "select count(*) from hot_word h where h.type = :type and  h.state = :status ORDER BY h.id DESC \n#pageable\n",
            nativeQuery = true)
    @RestResource(path = "findTypeAndStatus",exported = true )
    Page<HotWord> findByType(@Param("type")  @RequestParam(value = "type", defaultValue = "1")  String type, @Param("status")  @RequestParam(value = "status", defaultValue = "2")  String status, Pageable pageable);

    @Query(value = "select * from hot_word h where h.type = :type and  h.state = :status and h.number = :caseId ORDER BY h.id DESC \n#pageable\n",
            countQuery = "select count(*) from hot_word h where h.type = :type and  h.state = :status and h.number = :caseId ORDER BY h.id DESC \n#pageable\n",
            nativeQuery = true)
    @RestResource(path = "findTypeAndStatusAndCaseId",exported = true )
    Page<HotWord> findByTypeAndStautsAndCaseId(@Param("type")  @RequestParam(value = "type", defaultValue = "1")  String type, @Param("status")  @RequestParam(value = "status", defaultValue = "2") String status, @Param("caseId")  @RequestParam(value = "caseId", defaultValue = "1")  String caseId, Pageable pageable);


}

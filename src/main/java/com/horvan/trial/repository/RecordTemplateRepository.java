package com.horvan.trial.repository;

import com.horvan.trial.Constant;
import com.horvan.trial.entity.RecordTemplate;
import com.horvan.trial.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = Constant.TABLE_RECORD_TEMPLATE,path = "recordTemplate")
public interface RecordTemplateRepository extends PagingAndSortingRepository<RecordTemplate,Long>{

}

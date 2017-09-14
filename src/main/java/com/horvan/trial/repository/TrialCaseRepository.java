package com.horvan.trial.repository;

import com.horvan.trial.Constant;
import com.horvan.trial.entity.TrialCase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = Constant.TABLE_TRIAL_CASE,path = "trial_case")
public interface TrialCaseRepository extends PagingAndSortingRepository<TrialCase,Long>{
//    Repository方法是由一个动词、一个可选的主题（Subject）、关键词By以及一个断言所组成。在findByName()这个样例中，动词是find，断言是name，主题并没有指定，暗含的主题是User。
//    Spring Data允许在方法名中使用四种动词：get、read、find和count。其中，动词get、read和find是同义的，这三个动词对应的Repository方法都会查询数据并返回对象。而动词count则会返回匹配对象的数量，而不是对象本身。
//    在断言中，会有一个或多个限制结果的条件。每个条件必须引用一个属性，并且还可以指定一种比较操作。如果省略比较操作符的话，那么这暗指是一种相等比较
    @RestResource(path = "caseNo",exported = true )
    @Description("根据案号查询")
    List<TrialCase> findByCaseNo(@Param("caseNo") String caseNo);

//    ORDER BY ?#{#pageable}
//    ORDER BY a.id \n#pageable\n
//    CONCAT('%',:keyName,'%')  MYSQL 使用sql自带的函数来写sql
//    查询加入默认值
    @Query(value = "select * from trial_case t where t.case_no like CONCAT('%',:caseNo,'%') ORDER BY t.case_time DESC \n#pageable\n",
            countQuery = "select count(*) from trial_case t where t.case_no like CONCAT('%',:caseNo,'%')",
            nativeQuery = true)
    @RestResource(path = "findCaseNo",exported = true )
    public Page<TrialCase> find(@Param("caseNo")  @RequestParam(value = "caseNo", defaultValue = "00")  String caseNo, Pageable pageable);

    @Query(value = "select * from trial_case t where t.case_no like CONCAT('%',:caseNo,'%') and t.case_reason like CONCAT('%',:caseReason,'%') AND  t.trial_state = :trialStatus  and t.case_time BETWEEN :startTime and :endTime ORDER BY t.case_time DESC \n#pageable\n",
            countQuery = "select * from trial_case t where t.case_no like CONCAT('%',:caseNo,'%') and t.case_reason like CONCAT('%',:caseReason,'%') AND  t.trial_state = :trialStatus  and t.case_time BETWEEN :startTime and :endTime   ",
            nativeQuery = true)
    @RestResource(path = "findCase",exported = true )
    public Page<TrialCase> findCase(@Param("caseNo") @RequestParam(value = "caseNo", defaultValue = "1")  String caseNo, @Param("caseReason") @RequestParam(value = "caseReason", defaultValue = "00") String caseReason,@RequestParam(value = "trialStatus", defaultValue = "1")  @Param("trialStatus")int trialStatus ,@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  @RequestParam(value = "startTime", defaultValue = "2017-08-31 11:24:02") @Param("startTime") Date startTime, @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  @RequestParam(value = "endTime", defaultValue = "2017-09-03 13:28:35") @Param("endTime") Date endTime,Pageable pageable);

//    @Query(value = "select t from TrialCase t where t.caseNo=?1")
//    @RestResource(path = "findCase",exported = true )
//    public List<TrialCase> findCase(@Param("caseNo") String caseNo);

//        @Query(value = "select DISTINCT *  from trial_case u where u.case_no = :caseNo #{#pageable}",
//            countQuery= "select DISTINCT *  from trial_case u where u.case_no = :caseNo",
//            nativeQuery = true)
        @RestResource(path = "QueryCaseNo",exported = true )
        @Description("根据案号查询查询")
        Page<TrialCase> queryByCaseNo(@Param("caseNo") String caseNo,Pageable pageable);

//    @RestResource(path = "caseNoStartWith",exported = false )
//    @Description("根据案号查询,模糊查询")
//    List<TrialCase> findByCaseNoStartingWith(@Param("caseNo") String caseNo);

    /*
    * isStartingwith
    * StartingWith
    * StartsWith
    * 语义是一样的
    * */
//
//    @RestResource(path = "caseNoIsStartWith",exported = false )
//    @Description("根据案号查询,模糊查询,语义是一样的")
//    List<TrialCase> findByCaseNoIsStartingWith(@Param("caseNo") String caseNo);

    @RestResource(path = "caseNoIsLike" ,exported = false )
    @Description("根据案号查询,模糊查询,语义是一样的")
    List<TrialCase> findByCaseNoIsLike(@Param("caseNo") String caseNo);

    @RestResource(path = "caseNoAndCaseReason",exported = false )
    @Description("根据案号,和案由进行联合查询查询,")
    List<TrialCase> findByCaseNoAndCaseReason(@Param("caseNo") String caseNo,@Param("caseReason") String caseReason);

    @RestResource(path = "caseNoAndCaseReasonStartingWith" ,exported = false)
    @Description("根据案号,和案由进行联合查询查询,并且此连个字段都是模糊查询")
    List<TrialCase> findByCaseNoStartingWithAndCaseReasonStartingWith(@Param("caseNo") String caseNo,@Param("caseReason") String caseReason);


    @RestResource(path = "caseNoAndCaseReasonIsLike" ,exported = false)
    @Description("根据案号,和案由进行联合查询查询,并且此连个字段都是模糊查询")
    List<TrialCase> findByCaseNoIsLikeAndCaseReasonIsLike(@Param("caseNo") String caseNo,@Param("caseReason") String caseReason);

    @RestResource(path = "caseNoAndCaseReasonIsLikeOrderBy" )
    @Description("根据案号,和案由进行联合查询查询,并且此连个字段都是模糊查询")
    Page<TrialCase> findByCaseNoIsLikeAndCaseReasonIsLikeOrderByCaseTimeDesc(@Param("caseNo") String caseNo, @Param("caseReason") String caseReason, Pageable pageable);

    @RestResource(path = "caseNoAndCaseReasonAndTrialStatusIsLikeTrialStatusOrderBy" )
    @Description("根据案号,庭审状态和案由进行联合查询查询,案号与案由是模糊查询，庭审状态是精确查询，结果以案件时间倒序排序")
    List<TrialCase> findByCaseNoIsLikeAndTrialStateAndCaseReasonIsLikeOrderByCaseTimeDesc(@Param("caseNo") String caseNo,@Param("trialStatus")int status,@Param("caseReason") String caseReason);

    @RestResource(path = "findbyCaseTime",exported = false )
    @Description("根据案件时间进行范围查询,")
    List<TrialCase> findByCaseTimeBetweenOrderByCaseTimeDesc(@Param("startTime") Date startTime, @Param("endTime") Date endTime );


    @RestResource(path = "queryByCaseTime",exported = true )
    @Description("根据案件时间进行范围查询,")
    Page<TrialCase> queryByCaseTimeBetweenOrderByCaseTimeDesc(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") @Param("startTime")  Date startTime,@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss") @Param("endTime") Date endTime, Pageable pageable );

    @RestResource(path = "caseNoAndCaseReasonAndTrialStatusIsLikeTrialStatusAndCaseTimeOrderBy" )
    @Description("根据案号,庭审状态和案由进行联合查询查询,案号与案由是模糊查询，庭审状态是精确查询,案件时间范围，结果以案件时间倒序排序")
    List<TrialCase> findByCaseNoIsLikeAndTrialStateAndCaseReasonIsLikeAndCaseTimeBetweenOrderByCaseTimeDesc(@Param("caseNo") String caseNo,@Param("trialStatus")int status,@Param("caseReason") String caseReason,@Param("startTime") Date startTime, @Param("endTime") Date endTime);



}

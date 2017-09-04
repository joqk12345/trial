package com.horvan.trial;

import com.horvan.trial.entity.HotWord;
import com.horvan.trial.entity.TrialCase;
import com.horvan.trial.repository.HotWordRepository;
import com.horvan.trial.repository.TrialCaseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TrialCaseTest {

    @Autowired
    private TrialCaseRepository trialCaseRepository;


    @Test
    public void addTrialCase() throws  Exception{

//        hotWordRepository.save( new HotWord("003","庭审",1,2,"测试专用"));
//        hotWordRepository.save( new HotWord("004","布控",1,2,"测试专用"));

            trialCaseRepository.save(new TrialCase("001",1,"2017浙民终206号","房屋纠纷","浙江省高院第二法庭",new Date(),1));
            trialCaseRepository.save(new TrialCase("002",2,"2017浙民终206号","房屋纠纷","浙江省高院第二法庭",new Date(),1));
//        Assert.assertEquals(2,hotWordRepository.count());
//        Assert.assertEquals("布控",hotWordRepository.findByName("布控").getName());
//
//        hotWordRepository.deleteAll();
    }

    @Test
    public  void TestQuery() throws  Exception{
        TrialCase trialCase = trialCaseRepository.findOne(1L);
        System.out.println(trialCase.getTrialStateStr());

    }

    @Test
    public void TestByCaseNo() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNo("test007");
        System.out.println(trialCases.size());
    }

    @Test
    public void TestByfindCaseNo() throws Exception {
//        List<TrialCase> trialCases = trialCaseRepository.findCase("test007");
//        System.out.println(trialCases.size());
    }



//    @Test
//    public void TestByQueryCaseNo() throws Exception {
//        Page<TrialCase> trialCases = trialCaseRepository.readByByCaseNo("test007");
//        System.out.println(trialCases.getTotalElements());
//    }

    @Test
    public void TestByCaseNoStartingWith() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoStartingWith("00");
        System.out.println(trialCases.size());
    }


    @Test
    public void TestByCaseNoIsLike() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoIsLike("%00%");
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }

    }



    @Test
    public void TestByCaseNoAndCaseReason() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoAndCaseReason("1","1");
        System.out.println(trialCases.size());
    }

    @Test
    public void TestByCaseNoAndCaseReasonStrartingWith() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoStartingWithAndCaseReasonStartingWith("00","");
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }
    }

    @Test
    public void TestByCaseNoIsLikeAndCaseReasonIsLike() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoIsLikeAndCaseReasonIsLike("%00%","");
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }
    }

    @Test
    public void TestByCaseNoIsLikeAndCaseReasonIsLikeOrderBy() throws Exception {


//        Page<TrialCase> trialCases = trialCaseRepository.findByCaseNoIsLikeAndCaseReasonIsLikeOrderByCaseTimeDesc("%00%","",);
//        System.out.println(trialCases.getTotalElements());
//        for(TrialCase trialCase :trialCases){
//            System.out.println(trialCase.toString());
//        }
    }

    @Test
    public void TestByCaseNoIsLikeAndTrialStatusAndCaseReasonIsLikeOrderBy() throws Exception {
        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoIsLikeAndTrialStateAndCaseReasonIsLikeOrderByCaseTimeDesc("%00%",0,"");
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }
    }

    @Test
    public void TestByCaseTimeBetweenOrderByCaseTimeDesc() throws Exception {

        DateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        String startTimeText= "2017-08-31 11:24:02";
        String endTimeText= "2017-09-01 00:54:46";

        Date startTime =  formatter.parse(startTimeText);
        Date endTime = formatter.parse(endTimeText);

        List<TrialCase> trialCases = trialCaseRepository.findByCaseTimeBetweenOrderByCaseTimeDesc(startTime,endTime);
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }
    }

    @Test
    public void TestByCaseNoIsLikeAndTrialStateAndCaseReasonIsLikeAndCaseTimeBetweenOrderByCaseTimeDesc() throws Exception {

        DateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss");
        String startTimeText= "2017-08-31 11:24:02";
        String endTimeText= "2017-09-03 13:28:35";

        Date startTime =  formatter.parse(startTimeText);
        Date endTime = formatter.parse(endTimeText);

        List<TrialCase> trialCases = trialCaseRepository.findByCaseNoIsLikeAndTrialStateAndCaseReasonIsLikeAndCaseTimeBetweenOrderByCaseTimeDesc("%00%",0,"%1%",startTime,endTime);
        System.out.println(trialCases.size());
        for(TrialCase trialCase :trialCases){
            System.out.println(trialCase.toString());
        }
    }

}



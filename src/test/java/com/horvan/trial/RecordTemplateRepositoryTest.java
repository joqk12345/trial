package com.horvan.trial;

import com.horvan.trial.entity.RecordTemplate;
import com.horvan.trial.repository.RecordTemplateRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RecordTemplateRepositoryTest {

    @Autowired
    private RecordTemplateRepository recordTemplateRepository;

    @Test
    public void addRecordTemplate() throws  Exception{

        recordTemplateRepository.save(new RecordTemplate("001","默认模板",1,new Date(),1,"e://f.txt","测试模板"));
        recordTemplateRepository.save(new RecordTemplate("002","模板编号",1,new Date(),1,"e://f2.txt","测试模板2"));


//        Assert.assertEquals(2,hotWordRepository.count());
//        Assert.assertEquals("布控",hotWordRepository.findByName("布控").getName());
//
//        hotWordRepository.deleteAll();
    }


}

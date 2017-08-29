package com.horvan.trial;

import com.horvan.trial.entity.HotWord;
import com.horvan.trial.repository.HotWordRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class HotWordTest {

    @Autowired
    private HotWordRepository hotWordRepository;

    @Test
    public void addHotWord() throws  Exception{

//        hotWordRepository.save( new HotWord("003","庭审",1,2,"测试专用"));
//        hotWordRepository.save( new HotWord("004","布控",1,2,"测试专用"));


        Assert.assertEquals(2,hotWordRepository.count());
        Assert.assertEquals("布控",hotWordRepository.findByName("布控").getName());
    }


}

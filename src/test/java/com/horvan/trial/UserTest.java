package com.horvan.trial;

import com.horvan.trial.entity.HotWord;
import com.horvan.trial.entity.User;
import com.horvan.trial.repository.HotWordRepository;
import com.horvan.trial.repository.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void addUser() throws  Exception{


        userRepository.save(new User("joqk","123456",1));
        userRepository.save(new User("joqk12345","123456",1));



//        Assert.assertEquals(2,hotWordRepository.count());
//        Assert.assertEquals("布控",hotWordRepository.findByName("布控").getName());
//
//        hotWordRepository.deleteAll();
    }

    @Test
    public void SearchByNameAndPassword(){
       List<User> userList =  userRepository.findByUsernameAndPassword("joqk","123456");
       Assert.assertEquals(1, userList.size());

    }

}

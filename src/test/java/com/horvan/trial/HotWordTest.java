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

        hotWordRepository.save( new HotWord("003","庭审",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("004","布控",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("005","牛水车",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("006","摩天观景轮",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("007","天福宫",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("008","圣淘沙",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("009","新加坡万礼动物园",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("0010","鱼尾狮公园",1,2,"测试专用"));
//        泰国
        hotWordRepository.save( new HotWord("011","曼谷",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("012","普吉",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("013","清迈",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("014","帕塔亚",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("015","清莱",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("016","华欣",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("017","苏梅岛",1,2,"测试专用"));
//        马来西亚
        hotWordRepository.save( new HotWord("017","吉隆坡",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("018","云顶",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("019","槟城",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("020","马六甲",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("021","浮罗交怡岛",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("022","刁曼岛",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("023","热浪岛",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("024","邦咯",1,2,"测试专用"));
//        菲律宾
        hotWordRepository.save( new HotWord("025","长滩",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("026","宿雾",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("027","马尼拉",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("028","巴拉望",1,2,"测试专用"));
//        印尼
        hotWordRepository.save( new HotWord("029","巴厘岛",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("030","婆罗浮屠佛塔",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("031","缩影公园",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("032","日惹皇官",1,2,"测试专用"));
        hotWordRepository.save( new HotWord("033","多巴湖",1,2,"测试专用"));
//日本
        hotWordRepository.save( new HotWord("034","富士山",2,2,"专用词汇"));
        hotWordRepository.save( new HotWord("035","洞爷湖",2,2,"专用词汇"));
        hotWordRepository.save( new HotWord("036","金阁寺",2,2,"专用词汇"));
        hotWordRepository.save( new HotWord("037","清水寺",2,2,"专用词汇"));
        hotWordRepository.save( new HotWord("038","东京铁塔",2,2,"专用词汇"));





//        Assert.assertEquals(2,hotWordRepository.count());
//        Assert.assertEquals("布控",hotWordRepository.findByName("布控").getName());
//
//        hotWordRepository.deleteAll();
    }


}

package com.mfanw.test.mw_spring_boot;

import com.mfanw.test.mw_spring_boot.biz.IUserBiz;
import com.mfanw.test.mw_spring_boot.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MwSpringBootApplicationTests {

    @Autowired
    private IUserBiz userBiz;

    @Test
    public void contextLoads() {
        UserEntity entity = new UserEntity();
        entity.setUsername("u");
        entity.setPassword("p");
        userBiz.insert(entity);
    }

}

package com.baizhi;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsSpringbootApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
//        User user = new User();
//        user.setUsername("qwe");
//        User user1 =  userMapper.selectUserByObj(user);
//        System.out.println(user1);
        /*User user = new User();
        user.setUsername("aaa");
        user.setPassword("123");
        int i = userMapper.insertSelective(user);
        System.out.println(i);*/
        List<User> list = userMapper.selectUser();
        for (User user : list) {
            System.out.println(user);
        }
    }

}

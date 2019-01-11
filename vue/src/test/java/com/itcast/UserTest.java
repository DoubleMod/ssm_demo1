package com.itcast;

import com.itcast.domain.User;
import com.itcast.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
@Controller
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void findAll() {
        List<User> list = userService.findAll();
        System.out.println(list);

    }

    @Test
    public void updata() {
        User user = new User();
        user.setAge(10);
        user.setEmail("45465456@qq.com");
        user.setPassword("asdas65d6");
        user.setSex("男");
        userService.updataUser(user);

    }



}

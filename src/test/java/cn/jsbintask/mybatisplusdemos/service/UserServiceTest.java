package cn.jsbintask.mybatisplusdemos.service;

import cn.jsbintask.mybatisplusdemos.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author jsbintask@gmail.com
 * @date 2019/5/21 21:59
 */
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void findUsers() {
        List<User> users = userService.findUsers();

        Assert.assertTrue(users.size() > 0);
    }
}
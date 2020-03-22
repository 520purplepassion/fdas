package com.yl;

import com.yl.domain.User;
import com.yl.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaApplication.class)
public class JpaTest {

    @Resource
    private UserDao userDao;

    @Test
    public void test() {
        List<User> users = userDao.findAll();
        System.out.println(users);
    }
}

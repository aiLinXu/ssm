package cn.itcast.ssm.mapper;

import cn.itcast.ssm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml",
        "classpath:spring/applicationContext-mybatis.xml" })
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    public void queryUserById() {
        User user = userMapper.queryUserById(1L);
        System.out.println("user = " + user);
    }
}
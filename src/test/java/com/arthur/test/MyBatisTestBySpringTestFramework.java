
/**
 * @author lj
 *
 */
package com.arthur.test;


import java.util.Date;
import java.util.UUID;
import com.arthur.domain.User;
import com.arthur.service.UserServiceI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//������@ContextConfigurationע�Ⲣʹ�ø�ע���locations����ָ��spring�������ļ�֮��
@ContextConfiguration(locations = {"classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MyBatisTestBySpringTestFramework {

    //ע��userService
    @Autowired
    private UserServiceI userService;
    
    @Test
    public void testAddUser(){
        User user = new User();
        user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
        user.setUserName("xdp_gacl_�׻����");
        user.setUserBirthday(new Date());
        user.setUserSalary(10000D);
        userService.addUser(user);
    }
    
    @Test
    public void testGetUserById(){
        String userId = "fb1c5941094e400b975f10d9a9d602a3";
        User user = userService.getUserById(userId);
        System.out.println(user.getUserName());
    }
}
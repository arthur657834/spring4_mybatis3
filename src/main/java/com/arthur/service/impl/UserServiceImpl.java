/**
 * 
 */
/**
 * @author lj
 *
 */
package com.arthur.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.arthur.dao.UserMapper;
import com.arthur.domain.User;
import com.arthur.service.UserServiceI;;

/**
 * @author gacl
 * ʹ��@Serviceע�⽫UserServiceImpl���עΪһ��service
 * service��id��userService
 */
@Service("userService")
public class UserServiceImpl implements UserServiceI {

    /**
     * ʹ��@Autowiredע���עuserMapper������
     * ����Ҫʹ��UserMapperʱ��Spring�ͻ��Զ�ע��UserMapper
     */
    @Autowired
    private UserMapper userMapper;//ע��dao

//    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

//    @Override
    public User getUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
/**
 * 
 */
/**
 * @author lj
 *
 */
package com.arthur.service;


import com.arthur.domain.User;

public interface UserServiceI {

    /**
     * ����û�
     * @param user
     */
    void addUser(User user);
    
    /**
     * �����û�id��ȡ�û�
     * @param userId
     * @return
     */
    User getUserById(String userId);
}
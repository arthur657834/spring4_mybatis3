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
     * 添加用户
     * @param user
     */
    void addUser(User user);
    
    /**
     * 根据用户id获取用户
     * @param userId
     * @return
     */
    User getUserById(String userId);
}
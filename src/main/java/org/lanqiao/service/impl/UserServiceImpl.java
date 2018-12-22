package org.lanqiao.service.impl;

import org.lanqiao.mapper.IUserMapper;
import org.lanqiao.pojo.User;
import org.lanqiao.service.IUserService;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 18:03
 * @Description:
 */
public class UserServiceImpl implements IUserService {

    IUserMapper userMapper;
    public void setUserMapper(IUserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void add(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void remove(int id) {
        userMapper.deleteUser(id);
    }

    @Override
    public void modify(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getUserList();
    }
}

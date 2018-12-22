package org.lanqiao.service;

import org.lanqiao.mapper.IUserMapper;
import org.lanqiao.pojo.User;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 18:02
 * @Description:
 */
public interface IUserService {
    public void add(User user);
    public void remove(int id);
    public void modify(User user);
    public User getUser(int id);
    public List<User> getAll();

}

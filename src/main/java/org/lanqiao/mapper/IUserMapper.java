package org.lanqiao.mapper;

import org.lanqiao.pojo.User;

import java.util.List;

/**
 * @Auther: WDS
 * @Date: 2018/12/21 18:02
 * @Description:
 */
public interface IUserMapper {
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteUser(int id);
    public User getUser(int id);
    public List<User> getUserList();
}

package cn.bolianlai.repository;

import cn.bolianlai.entity.User;
import cn.bolianlai.entity.UserAddress;

import java.util.List;

public interface UserRepository {
    public User login(String loginName, String passWord);
    public List<UserAddress> findAllAddressByUserId(int id);
    public void register(User user);
}

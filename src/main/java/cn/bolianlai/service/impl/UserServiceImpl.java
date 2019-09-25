package cn.bolianlai.service.impl;

import cn.bolianlai.entity.User;
import cn.bolianlai.entity.UserAddress;
import cn.bolianlai.repository.UserRepository;
import cn.bolianlai.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String loginName, String passWord) {
        return userRepository.login(loginName, passWord);
    }

    @Override
    public List<UserAddress> findAllAddressByUserId(int id) {
        return userRepository.findAllAddressByUserId(id);
    }

    @Override
    public void register(User user) {
        userRepository.register(user);
    }
}

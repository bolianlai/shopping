package cn.bolianlai.service;

import cn.bolianlai.entity.UserAddress;

import java.util.List;

public interface AddressService {
    public void save(UserAddress userAddress);
    public List<UserAddress> findAllByUserId(int id);
}

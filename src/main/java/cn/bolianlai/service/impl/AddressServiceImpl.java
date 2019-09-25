package cn.bolianlai.service.impl;

import cn.bolianlai.entity.UserAddress;
import cn.bolianlai.repository.AddressRepository;
import cn.bolianlai.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(UserAddress userAddress) {
        addressRepository.save(userAddress);
    }

    @Override
    public List<UserAddress> findAllByUserId(int id) {
        return addressRepository.findAllByUserId(id);
    }
}

package cn.bolianlai.service.impl;

import cn.bolianlai.entity.Cart;
import cn.bolianlai.repository.CartRepository;
import cn.bolianlai.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartRepository cartRepository;

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> findAllByUserId(int id) {
        return cartRepository.findAllByUserId(id);
    }

    @Override
    public void deleteById(int id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void update(int id, int quantity, int cost) {
        Cart cart = new Cart();
        cart.setId(id);
        cart.setQuantity(quantity);
        cart.setCost(cost);
        cartRepository.update(cart);
    }
}

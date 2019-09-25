package cn.bolianlai.service;

import cn.bolianlai.entity.Order;
import cn.bolianlai.entity.OrderDetail;

import java.util.List;

public interface OrderService {
    public Order addOrder(int userId, String userAddress, int cost);
    public List<OrderDetail> findByOrderId(int orderId);
    public List<Order> findByUserId(int userId);
}

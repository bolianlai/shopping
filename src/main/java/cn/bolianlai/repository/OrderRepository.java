package cn.bolianlai.repository;

import cn.bolianlai.entity.Order;
import cn.bolianlai.entity.OrderDetail;

import java.util.List;

public interface OrderRepository {
    public void addOrder(Order order);
    public void addOrderDetail(OrderDetail orderDetail);
    public int getOrderId();
    public List<OrderDetail> findByOrderId(int orderId);
    public List<Order> findByUserId(int userId);
    public List<OrderDetail> findOrderDetailByOrderId(int orderId);
}

package shop_DB.services;

import shop_DB.entity.Orders;

import java.util.Date;
import java.util.List;


public interface OrdersService {
    void add(Orders orders);
    void edit(Orders orders);
    void remove(int id);
    Orders findOneById(int id);
    List<Orders> findAll();
}

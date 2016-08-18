package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.repo.OrdersRepo;
import shop_DB.entity.Orders;
import shop_DB.services.OrdersService;

import java.util.Date;
import java.util.List;


@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersRepo ordersRepo;

    public void add(Orders orders) {
        ordersRepo.save(orders);
    }

    public void edit(Orders orders) {
        ordersRepo.save(orders);
    }

    public void remove(int id) {
        ordersRepo.delete(id);
    }

    public Orders findOneById(int id) {
        return ordersRepo.findOne(id);
    }

    public List<Orders> findAll() {
        return ordersRepo.findAll();
    }
}

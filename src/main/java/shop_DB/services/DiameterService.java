package shop_DB.services;

import shop_DB.entity.Diameter;

import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public interface DiameterService {
    void add(Diameter diameter);
    void edit(Diameter diameter);
    void remove(int id);
    Diameter findOneById(int id);
    List<Diameter> findAll();
}

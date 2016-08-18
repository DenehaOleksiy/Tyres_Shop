package shop_DB.services;

import shop_DB.entity.Height;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
public interface HeightService {
    void add(Height height);
    void edit(Height height);
    void remove(int id);
    Height findOneById(int id);
    List<Height> findAll();
}

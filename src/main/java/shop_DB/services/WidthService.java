package shop_DB.services;

import shop_DB.entity.Width;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
public interface WidthService {

    void add(Width width);
    void edit(Width width);
    void remove(int id);
    Width findOneById(int id);
    List<Width> findAll();
}

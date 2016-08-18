package shop_DB.services;

import shop_DB.entity.Category;

import java.util.List;


public interface CategoryService {

    void add(Category category);
    void edit(Category category);
    void remove(int id);
    Category findOneById(int id);
    List<Category> findAll();
}

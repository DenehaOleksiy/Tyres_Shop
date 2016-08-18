package shop_DB.services;

import shop_DB.entity.Brand;

import java.util.List;

public interface BrandService {
    void add(Brand brand);
    void edit(Brand brand);
    void remove(int id);
    Brand findOneById(int id);
    List<Brand> findAll();
}

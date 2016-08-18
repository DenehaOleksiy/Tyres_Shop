package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.repo.BrandRepo;
import shop_DB.entity.Brand;
import shop_DB.services.BrandService;

import java.util.List;


@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepo brandRepo;

    public void add(Brand brand) {
        brandRepo.save(brand);
    }

    public void edit(Brand brand) {
        brandRepo.save(brand);
    }

    public void remove(int id) {
        brandRepo.delete(id);
    }

    public Brand findOneById(int id) {
        return brandRepo.findOne(id);
    }

    public List<Brand> findAll() {
        return brandRepo.findAll();
    }
}

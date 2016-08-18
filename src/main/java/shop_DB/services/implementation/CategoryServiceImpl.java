package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.repo.CategoryRepo;
import shop_DB.entity.Category;
import shop_DB.services.CategoryService;

import java.util.List;


@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepo categoryRepo;

    public void add(Category category) {
        categoryRepo.save(category);
    }

    public void edit(Category category) {
        categoryRepo.save(category);
    }

    public void remove(int id) {
        categoryRepo.delete(id);
    }

    public Category findOneById(int id) {
        return categoryRepo.findOne(id);
    }

    public List<Category> findAll() {
        return categoryRepo.findAll();
    }
}

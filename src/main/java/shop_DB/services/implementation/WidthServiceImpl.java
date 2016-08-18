package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.entity.Width;
import shop_DB.repo.WidthRepo;
import shop_DB.services.WidthService;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Service
public class WidthServiceImpl implements WidthService {

    @Autowired
    private WidthRepo widthRepo;

    public void add(Width width) {
        widthRepo.save(width);
    }

    public void edit(Width width) {
        widthRepo.save(width);
    }

    public void remove(int id) {
        widthRepo.delete(id);
    }

    public Width findOneById(int id) {
        return widthRepo.findOne(id);
    }

    public List<Width> findAll() {
        return widthRepo.findAll();
    }
}

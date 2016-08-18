package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.entity.Height;
import shop_DB.repo.HeightRepo;
import shop_DB.services.HeightService;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Service
public class HeightServiceImpl implements HeightService {

    @Autowired
    private HeightRepo heightRepo;

    public void add(Height height) {
        heightRepo.save(height);
    }

    public void edit(Height height) {
        heightRepo.save(height);
    }

    public void remove(int id) {
        heightRepo.delete(id);
    }

    public Height findOneById(int id) {
        return heightRepo.findOne(id);
    }

    public List<Height> findAll() {
        return heightRepo.findAll();
    }
}

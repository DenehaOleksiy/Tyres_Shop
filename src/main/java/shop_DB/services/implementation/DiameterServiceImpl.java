package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop_DB.entity.Diameter;
import shop_DB.repo.DiameterRepo;
import shop_DB.services.DiameterService;

import java.util.List;

/**
 * Created by Администратор on 15.07.2016.
 */
@Service
public class DiameterServiceImpl implements DiameterService {
    @Autowired
    private DiameterRepo diameterRepo;

    public void add(Diameter diameter) {
        diameterRepo.save(diameter);
    }

    public void edit(Diameter diameter) {
        diameterRepo.save(diameter);
    }

    public void remove(int id) {
        diameterRepo.delete(id);
    }

    public Diameter findOneById(int id) {
        return diameterRepo.findOne(id);
    }

    public List<Diameter> findAll() {
        return diameterRepo.findAll();
    }
}

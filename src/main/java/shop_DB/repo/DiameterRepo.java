package shop_DB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import shop_DB.entity.Diameter;

/**
 * Created by Администратор on 14.07.2016.
 */
public interface DiameterRepo extends JpaRepository<Diameter,Integer>{


}

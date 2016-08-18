package shop_DB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import shop_DB.entity.Brand;

import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public interface BrandRepo extends JpaRepository<Brand,Integer> {

}

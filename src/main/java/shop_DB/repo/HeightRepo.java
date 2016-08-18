package shop_DB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import shop_DB.entity.Height;

/**
 * Created by Администратор on 09.08.2016.
 */
public interface HeightRepo extends JpaRepository<Height,Integer> {
}

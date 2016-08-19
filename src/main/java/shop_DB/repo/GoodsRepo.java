package shop_DB.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import shop_DB.entity.Goods;

import java.util.List;

/**
 * Created by Администратор on 14.07.2016.
 */
public interface GoodsRepo extends JpaRepository<Goods,Integer>{

    @Query("select g from Goods g where g.name like :param")
    List<Goods> findName(@Param("param") String name);

    @Query("select g from Goods g where g.diameter.sizeDiameter = :param")
    List<Goods> findDiameter(@Param("param") int diameter);

    @Query("select  g from Goods  g order by g.price")
    List<Goods> orderByPrice();

    @Query("select g from Goods g where g.price between ?1 and ?2 order by g.price")
    List<Goods> findBetween(@Param("1") int price1, @Param("2") int price2);


}

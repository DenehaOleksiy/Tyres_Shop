package shop_DB.services;

import org.springframework.web.multipart.MultipartFile;
import shop_DB.DTO.GoodsDTO;
import shop_DB.entity.Goods;

import java.util.List;


public interface GoodsService {

    void add(Integer price, String name, Integer diameterId, Integer widthId, Integer heightId, Integer brandId,
             Integer categoryId, MultipartFile multipartFile);

    void remove(int id);

    Goods findOne(int id);

    List<GoodsDTO> findName(String name);

    void edit(Integer id,Integer price, String name,Integer diameterId, Integer widthId, Integer heightId,
              Integer brandId, Integer categoryId);

    List<GoodsDTO> findAll();

    GoodsDTO findOneById(int id);

    List<GoodsDTO> findDiameter(int sizeDiameter);

    List<GoodsDTO> orderByPrice();

    List<GoodsDTO> findBetween(int a, int b);
}

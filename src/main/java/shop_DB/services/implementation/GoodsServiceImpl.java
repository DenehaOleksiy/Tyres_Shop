package shop_DB.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import shop_DB.DTO.GoodsDTO;
import shop_DB.entity.*;
import shop_DB.repo.*;
import shop_DB.services.GoodsService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepo goodsRepo;
    @Autowired
    private DiameterRepo diameterRepo;
    @Autowired
    private BrandRepo brandRepo;
    @Autowired
    private CategoryRepo categoryRepo;
    @Autowired
    private WidthRepo widthRepo;
    @Autowired
    private HeightRepo heightRepo;


    @Override
    public void add(Integer price, String name, Integer diameterId, Integer widthId,
                    Integer heightId, Integer brandId, Integer categoryId, MultipartFile multipartFile) {
        Goods goods = new Goods();
        goods.setPrice(price);
        goods.setName(name);
        Diameter diameter = diameterRepo.findOne(diameterId);
        goods.setDiameter(diameter);
        Width width = widthRepo.findOne(widthId);
        goods.setWidth(width);
        Height height = heightRepo.findOne(heightId);
        goods.setHeight(height);
        Brand brand = brandRepo.findOne(brandId);
        goods.setBrand(brand);
        Category category = categoryRepo.findOne(categoryId);
        goods.setCategory(category);
        try {
            goods.setImage(multipartFile.getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
        goodsRepo.save(goods);
    }


    public void remove(int id) {
        goodsRepo.delete(id);
    }

    public Goods findOne(int id) {
        return goodsRepo.findOne(id);
    }


    public List<GoodsDTO> findAll(){
        List<GoodsDTO> goodsDTOs = new ArrayList<>();
        List<Goods>goodsList = goodsRepo.findAll();
        for(Goods goods:goodsList){
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setId(goods.getId());
            goodsDTO.setName(goods.getName());
            goodsDTO.setBrand(goods.getBrand());
            goodsDTO.setCategory(goods.getCategory());
            goodsDTO.setDiameter(goods.getDiameter());
            goodsDTO.setWidth(goods.getWidth());
            goodsDTO.setHeight(goods.getHeight());
            goodsDTO.setPrice(goods.getPrice());
            String image = Base64.getEncoder().encodeToString(goods.getImage());
            goodsDTO.setImage(image);
            goodsDTOs.add(goodsDTO);
        }return goodsDTOs;
    }

    @Override
    public void edit(Integer id, Integer price, String name, Integer diameterId, Integer widthId, Integer heightId, Integer brandId, Integer categoryId) {
        Goods goods = goodsRepo.findOne(id);
        goods.setId(id);
        goods.setPrice(price);
        goods.setName(name);
        Diameter diameter = diameterRepo.findOne(diameterId);
        goods.setDiameter(diameter);
        Width width = widthRepo.findOne(widthId);
        goods.setWidth(width);
        Height height = heightRepo.findOne(heightId);
        goods.setHeight(height);
        Brand brand = brandRepo.findOne(brandId);
        goods.setBrand(brand);
        Category category = categoryRepo.findOne(categoryId);
        goods.setCategory(category);
        goodsRepo.save(goods);
    }

    public List<GoodsDTO> findName(String name) {
        List<GoodsDTO> goodsDTOs = new ArrayList<>();
        List<Goods> goodsList = goodsRepo.findName(name);
        for (Goods goods : goodsList) {
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setId(goods.getId());
            goodsDTO.setName(goods.getName());
            goodsDTO.setBrand(goods.getBrand());
            goodsDTO.setCategory(goods.getCategory());
            goodsDTO.setDiameter(goods.getDiameter());
            goodsDTO.setWidth(goods.getWidth());
            goodsDTO.setHeight(goods.getHeight());
            goodsDTO.setPrice(goods.getPrice());
            String image = Base64.getEncoder().encodeToString(goods.getImage());
            goodsDTO.setImage(image);
            goodsDTOs.add(goodsDTO);
        }
        return goodsDTOs;
    }


    public GoodsDTO findOneById(int id){
        Goods goods = goodsRepo.findOne(id);
        GoodsDTO goodsDTO = new GoodsDTO();
        goodsDTO.setId(goods.getId());
        goodsDTO.setName(goods.getName());
        goodsDTO.setPrice(goods.getPrice());
        goodsDTO.setDiameter(goods.getDiameter());
        goodsDTO.setWidth(goods.getWidth());
        goodsDTO.setHeight(goods.getHeight());
        goodsDTO.setCategory(goods.getCategory());
        goodsDTO.setBrand(goods.getBrand());
        String image = Base64.getEncoder().encodeToString(goods.getImage());
        goodsDTO.setImage(image);
        return goodsDTO;
    }

    @Override
    public List<GoodsDTO> findDiameter(int sizeDiameter) {
        List<GoodsDTO> goodsDTOs = new ArrayList<>();
        List<Goods> goodsList = goodsRepo.findDiameter(sizeDiameter);
        for (Goods goods : goodsList) {
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setId(goods.getId());
            goodsDTO.setName(goods.getName());
            goodsDTO.setBrand(goods.getBrand());
            goodsDTO.setCategory(goods.getCategory());
            goodsDTO.setDiameter(goods.getDiameter());
            goodsDTO.setWidth(goods.getWidth());
            goodsDTO.setHeight(goods.getHeight());
            goodsDTO.setPrice(goods.getPrice());
            String image = Base64.getEncoder().encodeToString(goods.getImage());
            goodsDTO.setImage(image);
            goodsDTOs.add(goodsDTO);
        }
        return goodsDTOs;
    }

   public List<GoodsDTO> orderByPrice(){
       List<GoodsDTO> goodsDTOs = new ArrayList<>();
       List<Goods>goodsList = goodsRepo.orderByPrice();
       for(Goods goods:goodsList){
           GoodsDTO goodsDTO = new GoodsDTO();
           goodsDTO.setId(goods.getId());
           goodsDTO.setName(goods.getName());
           goodsDTO.setBrand(goods.getBrand());
           goodsDTO.setCategory(goods.getCategory());
           goodsDTO.setDiameter(goods.getDiameter());
           goodsDTO.setWidth(goods.getWidth());
           goodsDTO.setHeight(goods.getHeight());
           goodsDTO.setPrice(goods.getPrice());
           String image = Base64.getEncoder().encodeToString(goods.getImage());
           goodsDTO.setImage(image);
           goodsDTOs.add(goodsDTO);
       }return goodsDTOs;
    }

   public List<GoodsDTO> findBetween(int a, int b){
        List<GoodsDTO> goodsDTOs = new ArrayList<>();
        List<Goods>goodsList = goodsRepo.findBetween(a,b);
        for(Goods goods:goodsList){
            GoodsDTO goodsDTO = new GoodsDTO();
            goodsDTO.setId(goods.getId());
            goodsDTO.setName(goods.getName());
            goodsDTO.setBrand(goods.getBrand());
            goodsDTO.setCategory(goods.getCategory());
            goodsDTO.setDiameter(goods.getDiameter());
            goodsDTO.setWidth(goods.getWidth());
            goodsDTO.setHeight(goods.getHeight());
            goodsDTO.setPrice(goods.getPrice());
            String image = Base64.getEncoder().encodeToString(goods.getImage());
            goodsDTO.setImage(image);
            goodsDTOs.add(goodsDTO);
        }return goodsDTOs;

    }
}

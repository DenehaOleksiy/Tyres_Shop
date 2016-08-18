package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop_DB.DTO.GoodsDTO;
import shop_DB.entity.Goods;
import shop_DB.entity.Orders;
import shop_DB.entity.User;
import shop_DB.services.GoodsService;
import shop_DB.services.OrdersService;
import shop_DB.services.UserService;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Администратор on 12.08.2016.
 */
@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private UserService userService;



    @RequestMapping(value = "/addToCart/{id}", method = RequestMethod.POST)
    public String buyForm(@PathVariable String id, Principal principal){
        User user = userService.findOneById(Integer.parseInt(principal.getName()));
        Goods goods = goodsService.findOne(Integer.parseInt(id));
        List<Goods> goodsList = user.getGoodsList();
        goodsList.add(goods);
        int quantity = 0;
        int summa = 0;
        for(Goods g : goodsList){
            int a = g.getPrice();
            summa+= a;
            quantity++;
        }
        // System.out.println(quantity);
        //System.out.println(summa);
        user.setGoodsList(user.getGoodsList());
        user.setGoodsQuantity(quantity);
        user.setTotalSumma(summa);
        userService.add(user);
        return "redirect:/goods/all";
    }


    @RequestMapping(value = "/remove/{id}",method = RequestMethod.POST)
    public String remove(@PathVariable Integer id, Principal principal,Model model){

        User user = userService.findOneById(Integer.parseInt(principal.getName()));
        Goods goods = goodsService.findOne(id);
        List<Goods> goodsList = user.getGoodsList();
        goodsList.add(goods);
        Iterator<Goods> iterator = goodsList.iterator();
        while (iterator.hasNext()){
            Goods g = iterator.next();
            if(goods.getId() == g.getId())
                iterator.remove();
        }
        int quantity = 0;
        int summa = 0;
        for(Goods g : goodsList){
            int a = g.getPrice();
            summa+= a;
            quantity++;
        }
        System.out.println(quantity);
        System.out.println(summa);
        user.setGoodsList(user.getGoodsList());
        user.setGoodsQuantity(quantity);
        user.setTotalSumma(summa);
        userService.add(user);
        return "redirect:/basket";
    }



    @RequestMapping(value = "/basket")
    public String getBasket(Principal principal,Model model){
        User user = userService.findOneById(Integer.parseInt(principal.getName()));
        List<Goods> goodsList = user.getGoodsList();
        List<GoodsDTO> goodsDTOs = new ArrayList<>();
        int summ =0;
        for(Goods goods : goodsList){
            GoodsDTO g = new GoodsDTO();
            g.setId(goods.getId());
            g.setName(goods.getName());
            g.setBrand(goods.getBrand());
            g.setCategory(goods.getCategory());
            g.setDiameter(goods.getDiameter());
            g.setHeight(goods.getHeight());
            g.setWidth(goods.getWidth());
            g.setPrice(goods.getPrice());
            String image = Base64.getEncoder().encodeToString(goods.getImage());
            g.setImage(image);
            goodsDTOs.add(g);
            summ += goods.getPrice();
        }
        model.addAttribute("summ", summ);
        model.addAttribute("goods",goodsDTOs);
        return"views-user-basket";
    }
}

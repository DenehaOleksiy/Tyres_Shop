package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import shop_DB.DTO.GoodsDTO;
import shop_DB.entity.Goods;
import shop_DB.services.*;

import java.util.List;

/**
 * Created by Администратор on 17.07.2016.
 */
@Controller
public class GoodsController {


    @Autowired
    private GoodsService goodsService;
    @Autowired
    private DiameterService diameterService;
    @Autowired
    private HeightService heightService;
    @Autowired
    private WidthService widthService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private CategoryService categoryService;


    @RequestMapping(value = "/goods/all")
    public String showAll(Model model){
        List<GoodsDTO> goodsList = goodsService.findAll();
        model.addAttribute("showAll",goodsList);
        return "views-goods-all";
    }



    @RequestMapping(value = "/goods/add")
    public String addTyres(Model model){
        model.addAttribute("brand",brandService.findAll());
        model.addAttribute("diameter", diameterService.findAll());
        model.addAttribute("width", widthService.findAll());
        model.addAttribute("height", heightService.findAll());
        model.addAttribute("category",categoryService.findAll());
        return"views-goods-add";
    }
    @RequestMapping(value = "/addNewTyres",method = RequestMethod.POST)
    public String addTyres(@RequestParam("price")Integer price, @RequestParam("name")String name,
                           @RequestParam("diameter") Integer diameterId,
                           @RequestParam("width") Integer widthId, @RequestParam("height") Integer heightId,
                           @RequestParam("brand") Integer brandId, @RequestParam("category") Integer categoryId,
                           @RequestParam("image")MultipartFile multipartFile) {

        goodsService.add(price, name, diameterId, widthId, heightId, brandId, categoryId, multipartFile);
        return "redirect:/goods/all";
    }



    @RequestMapping(value = "/goods/page/{id}", method = RequestMethod.GET)
    public String authorPage(@PathVariable String id, Model model) {
        GoodsDTO goods = goodsService.findOneById(Integer.parseInt(id));
        model.addAttribute("goods", goods);
        return "views-goods-page";
    }


    @RequestMapping(value = "/goods/delete/{id}")
    public String delete(@PathVariable String id){
        goodsService.remove(Integer.parseInt(id));
        return"redirect:/goods/all";
    }



    @RequestMapping(value = "/goods/edit/{id}", method = RequestMethod.GET)
    public String editForm(@PathVariable String id, Model model){
        GoodsDTO goods = goodsService.findOneById(Integer.parseInt(id));
        model.addAttribute("edit", goods);
        model.addAttribute("brand",brandService.findAll());
        model.addAttribute("diameter", diameterService.findAll());
        model.addAttribute("width", widthService.findAll());
        model.addAttribute("height", heightService.findAll());
        model.addAttribute("category",categoryService.findAll());
        // System.out.println(id);
        return"views-goods-editForm";
    }

    @RequestMapping(value = "/edit/Goods",method = RequestMethod.POST)
    public String edit(@RequestParam("id")Integer id, @RequestParam("price")Integer price, @RequestParam("name")String name,
                       @RequestParam("diameter") Integer diameterId,
                       @RequestParam("width") Integer widthId, @RequestParam("height") Integer heightId,
                       @RequestParam("brand") Integer brandId, @RequestParam("category") Integer categoryId) {
        goodsService.edit(id, price, name, diameterId, widthId, heightId, brandId, categoryId);
        return "redirect:/goods/all";
    }




    @RequestMapping(value = "/find/name")
    public String nameForm(Model model){
        model.addAttribute("names", new Goods());
        return "views-goods-nameForm";
    }
    @RequestMapping(value = "/find/name/name",method = RequestMethod.POST)
    public String nameResult(@RequestParam String name, Model model){
        List<GoodsDTO> goodsList = goodsService.findName(name);
        model.addAttribute("nameList",goodsList);
        return "views-goods-nameView";

    }



    @RequestMapping(value = "/find/diameter")
    public String diamForm(Model model){
        model.addAttribute("diam", diameterService.findAll());
        return "views-goods-diamForm";
    }

    @RequestMapping(value = "/find/diameterView",method = RequestMethod.POST)
    public String diamView(@RequestParam("diameter")Integer sizeDiameter, Model model){
        System.out.println(sizeDiameter);
        List<GoodsDTO> goodsDTOList = goodsService.findDiameter(sizeDiameter);
        System.out.println(goodsDTOList.size());
        model.addAttribute("diamList", goodsDTOList);
        return "views-goods-diamView";
    }

    @RequestMapping(value = "/orderByPrice")
    public String orderByPrice(Model model){
      List<GoodsDTO> goodslist =  goodsService.orderByPrice();
        model.addAttribute("showAll",goodslist);
        return"views-goods-all";
    }

    @RequestMapping(value = "/between")
    public String between(){
        return"views-goods-between";
    }

    @RequestMapping(value = "/betweenView", method = RequestMethod.POST)
    public String betweenView(@RequestParam ("from") String a, @RequestParam("to") String b, Model model){
        List<GoodsDTO> goodslist = goodsService.findBetween(Integer.parseInt(a), Integer.parseInt(b));
        model.addAttribute("showAll",goodslist);
        return"views-goods-all";
    }
}

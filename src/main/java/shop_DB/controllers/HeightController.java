package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import shop_DB.entity.Height;
import shop_DB.services.HeightService;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Controller
public class HeightController {

    @Autowired
    private HeightService heightService;

    @RequestMapping(value = "/all/height")
    public String allSize(Model model){
        List<Height> heightList = heightService.findAll();
        model.addAttribute("allHeight", heightList);
        return"views-size-allHeight";
    }


    @RequestMapping(value = "/add/height")
    public String addSize(Model model){
        model.addAttribute("newHeight",new Height());
        return "views-size-formHeight";
    }
    @RequestMapping(value = "/new/height", method = RequestMethod.POST)
    public String newSize(@ModelAttribute Height height){
        heightService.add(height);
        return"redirect:/all/height";

    }



    @RequestMapping(value = "/edit/height/form")
    public String editForm(Model model){
        model.addAttribute("edit",new Height());
        return"views-size-editHeight";
    }
    @RequestMapping(value = "/edit/height",method = RequestMethod.POST)
    public String edit(@RequestParam("id") String id, Model model){
        Height height = heightService.findOneById(Integer.parseInt(id));
        model.addAttribute("ed", height);
        return"views-size-editFormHeight";
    }
    @RequestMapping(value = "/edit/resultHeight",method = RequestMethod.POST)
    public String editResult(@ModelAttribute Height height){
        heightService.edit(height);
        return"redirect:/all/height";
    }


    @RequestMapping(value = "/delete/height/form")
    public String deleteForm(Model model){
        model.addAttribute("delete",new Height());
        return"views-size-deleteHeight";
    }
    @RequestMapping(value = "/delete/height",method = RequestMethod.POST)
    public String delete(@RequestParam("id") String id, Model model){
        Height height = heightService.findOneById(Integer.parseInt(id));
        heightService.remove(Integer.parseInt(id));
        return"redirect:/all/height";
    }
}

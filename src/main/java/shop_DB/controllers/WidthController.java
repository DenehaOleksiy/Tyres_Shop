package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import shop_DB.entity.Width;
import shop_DB.services.WidthService;

import java.util.List;

/**
 * Created by Администратор on 09.08.2016.
 */
@Controller
public class WidthController {

    @Autowired
    private WidthService widthService;

    @RequestMapping(value = "/all/width")
    public String allSize(Model model){
        List<Width> widthList = widthService.findAll();
        model.addAttribute("allWidth", widthList);
        return"views-size-allWidth";
    }


    @RequestMapping(value = "/add/width")
    public String addSize(Model model){
        model.addAttribute("newWidth",new Width());
        return "views-size-formWidth";
    }
    @RequestMapping(value = "/new/width", method = RequestMethod.POST)
    public String newSize(@ModelAttribute Width width){
        widthService.add(width);
        return"redirect:/all/width";

    }



    @RequestMapping(value = "/edit/width/form")
    public String editForm(Model model){
        model.addAttribute("edit",new Width());
        return"views-size-editWidth";
    }
    @RequestMapping(value = "/edit/width",method = RequestMethod.POST)
    public String edit(@RequestParam("id") String id, Model model){
        Width width = widthService.findOneById(Integer.parseInt(id));
        model.addAttribute("ed", width);
        return"views-size-editFormWidth";
    }
    @RequestMapping(value = "/edit/resultWidth",method = RequestMethod.POST)
    public String editResult(@ModelAttribute Width width){
        widthService.edit(width);
        return"redirect:/all/width";
    }


    @RequestMapping(value = "/delete/width/form")
    public String deleteForm(Model model){
        model.addAttribute("delete",new Width());
        return"views-size-deleteWidth";
    }
    @RequestMapping(value = "/delete/width",method = RequestMethod.POST)
    public String delete(@RequestParam("id") String id, Model model){
        Width width = widthService.findOneById(Integer.parseInt(id));
        widthService.remove(Integer.parseInt(id));
        return"redirect:/all/width";
    }
}

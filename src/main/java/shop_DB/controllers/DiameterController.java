package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import shop_DB.entity.Diameter;
import shop_DB.services.DiameterService;

import java.util.List;

/**
 * Created by Администратор on 07.08.2016.
 */
@Controller
public class DiameterController {

    @Autowired
    private DiameterService diameterService;

    @RequestMapping(value = "/all/diameter")
    public String allSize(Model model){
        List<Diameter> diameterList = diameterService.findAll();
        model.addAttribute("allDiameter", diameterList);
        return"views-size-allDiameter";
    }


    @RequestMapping(value = "/add/diameter")
    public String addSize(Model model){
        model.addAttribute("newDiameter",new Diameter());
        return "views-size-formDiameter";
    }
    @RequestMapping(value = "/new/diameter", method = RequestMethod.POST)
    public String newSize(@ModelAttribute Diameter diameter){
        diameterService.add(diameter);
        return"redirect:/all/diameter";

    }



    @RequestMapping(value = "/edit/diameter/form")
    public String editForm(Model model){
        model.addAttribute("edit",new Diameter());
        return"views-size-editDiameter";
    }
    @RequestMapping(value = "/edit/diameter",method = RequestMethod.POST)
    public String edit(@RequestParam("id") String id, Model model){
        Diameter diameter = diameterService.findOneById(Integer.parseInt(id));
        model.addAttribute("ed", diameter);
        return"views-size-editFormDiameter";
    }
    @RequestMapping(value = "/edit/result",method = RequestMethod.POST)
    public String editResult(@ModelAttribute Diameter diameter){
        diameterService.edit(diameter);
        return"redirect:/all/diameter";
    }


    @RequestMapping(value = "/delete/diameter/form")
    public String deleteForm(Model model){
        model.addAttribute("delete",new Diameter());
        return"views-size-deleteDiameter";
    }
    @RequestMapping(value = "/delete/diameter",method = RequestMethod.POST)
    public String delete(@RequestParam("id") String id, Model model){
        Diameter diameter = diameterService.findOneById(Integer.parseInt(id));
        diameterService.remove(Integer.parseInt(id));
        return"redirect:/all/diameter";
    }
}

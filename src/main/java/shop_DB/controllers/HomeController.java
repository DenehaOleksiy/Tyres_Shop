package shop_DB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Администратор on 17.07.2016.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "views-base-home";
    }

    @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
    public String login(){
        return "views-base-login";
    }

}

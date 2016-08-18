package shop_DB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import shop_DB.entity.User;
import shop_DB.services.UserService;
import shop_DB.validators.UserValidator;

/**
 * Created by Администратор on 07.08.2016.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserValidator userValidator;

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registration(Model model){
        model.addAttribute("user", new User());
        return "views-base-registration";
    }

//    @RequestMapping(value = "/registration/{regVar}", method = RequestMethod.GET)
//    public String singup(@PathVariable String regVar){
//
//        User user = new User();
//
//        regVar = regVar.replace("-",".");
//
//        String[] userProperty = regVar.split("&");
//
//        user.setName(userProperty[0]);
//        user.setSecondname(userProperty[1]);
//
//        String password = userProperty[2];
//
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        user.setPassword(encoder.encode(password));
//
//        System.out.println(userProperty[3]);
//
//        user.setEmailAdress(userProperty[3]);
//
//        userService.add(user);
//
//        return "redirect:/";
//    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(@ModelAttribute User user, BindingResult bindingResult){
        userValidator.validate(user, bindingResult);
        if (bindingResult.hasErrors()){
            return "views-base-registration";
        }

//        else {
//            String registrationVar = user.getName() + "&" + user.getSecondname() + "&" + user.getPassword() +
//                    "&" + user.getEmailAdress();
//
//            userService.sendEmail(user.getId(), user.getEmailAdress(), user.getName(), user.getPassword(), registrationVar);
//
//            return "redirect:/";
//        }
        else {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            user.setPassword(encoder.encode(user.getPassword()));
            userService.add(user);
            return "redirect:/";
        }


    }

}


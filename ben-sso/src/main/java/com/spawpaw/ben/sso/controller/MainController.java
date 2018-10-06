package com.spawpaw.ben.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By spawpaw@hotmail.com  2018-08-24
 *
 * @author BenBenShang spawpaw@hotmail.com
 */
@Controller
@RequestMapping(path = "")
public class MainController {

    @GetMapping("index")
    public String index() {
        return "index";
    }

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

    // Login form with error
    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }
}

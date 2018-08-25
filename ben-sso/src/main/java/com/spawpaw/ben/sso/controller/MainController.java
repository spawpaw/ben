package com.spawpaw.ben.sso.controller;

import org.springframework.stereotype.Controller;
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

    @GetMapping("login")
    public String loginPage() {
        return "login";
    }
}

package com.muratovic.swaggerusage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@ApiIgnore
public class HomeController {

    @RequestMapping("/documentation")
    public String getAPIDocumentationPage(){
        return "redirect:swagger-ui.html";
    }
}

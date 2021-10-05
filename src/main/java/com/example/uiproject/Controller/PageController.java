package com.example.uiproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/")
    public String getIndex (){
        return "index";
    }

    @GetMapping("/0-5")
    public String getPreschool (){
        return "preschool";
    }

    @GetMapping("/6-10")
    public String getMiddleschool (){
        return "middleschool";
    }

    @GetMapping("/gym")
    public String getHighschool (){
        return "highschool";
    }

    @GetMapping("/tips")
    public String getTips (){
        return "tips";
    }

    @GetMapping("/about")
    public String getAbout (){
        return "about";
    }
}

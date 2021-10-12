package com.example.uiproject.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String getIndex (){
        return "index";
    }
    @GetMapping("/test")
    public String getTest (){
        return "test";
    }

    @GetMapping("/0-5")
    public String getPreschool (){
        return "preschool";
    }

    @GetMapping("/6-10")
    public String getMiddleschool (){
        return "middleschool6.-10";
    }

    @GetMapping("/gym")
    public String getHighschool (){
        return "gym";
    }

    @GetMapping("/tips")
    public String getTips (){
        return "tips";
    }

    @GetMapping("/about")
    public String getAbout (){
        return "about";
    }

    @GetMapping("/0-5kon")
    public String get05kon (){
        return "6-10kon";
    }

    @GetMapping("/6-10kon")
    public String get610kon (){
        return "6-10kon";
    }

    @GetMapping("/gymkon")
    public String getGymkon (){
        return "gymkon";
    }

}

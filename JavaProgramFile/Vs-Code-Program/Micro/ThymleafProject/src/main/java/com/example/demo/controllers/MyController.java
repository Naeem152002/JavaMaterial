package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyController {

    @GetMapping()
    public String about(Model model) {

        System.out.println("Inside the handler");

        model.addAttribute("name", "Naeem Qureshi");
        model.addAttribute("date", new Date().toLocaleString());
        return "about";

    }
    //handling iteration

 @GetMapping("/loop")
 public String iterateHandler(Model model) {
    System.out.println("handler");

    List<String>names=List.of("Ankit","Laxmi","karn","Johan");
    model.addAttribute("List", names);

        return "iterate";

    }
 @GetMapping("/cond")
 public String conditionHandler(Model model) {
    System.out.println("condtionhandler");

    model.addAttribute("isActive", false);
    model.addAttribute("gender", "M");

    List<Integer>list=List.of(56,85,84,65);
    model.addAttribute("myList", list);


        return "condition";

    }
 @GetMapping("/service")
 public String serviceHandler(Model model) {

    model.addAttribute("title", "I like it");
    model.addAttribute("subtitle", LocalDateTime.now().toString());
   
   return "service";

    }
 @GetMapping("/newabout")
 public String newAbout(Model model) {

   return "aboutnew";

    }
 @GetMapping("/contact")
 public String contact(Model model) {

   return "contact";

    }
}

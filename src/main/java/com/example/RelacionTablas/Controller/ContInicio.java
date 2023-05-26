package com.example.RelacionTablas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ContInicio {

    @GetMapping("/inicio")
    public String ini (Model model){
        model.addAttribute("titulo", "Inicio");
        return "inicio";
    }

}

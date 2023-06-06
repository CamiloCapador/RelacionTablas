package com.example.RelacionTablas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ContPerfil {

    @GetMapping("/perfil")
    public String perfil (Model model){
        model.addAttribute("titulo", "Perfil");
        return "perfil";
    }
}

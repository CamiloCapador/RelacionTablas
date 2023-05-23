package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.IElementoService;
import com.example.RelacionTablas.Model.Elemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ContElemento {

    @Autowired
    private IElementoService se;
    @GetMapping("/verelementos")
    public String verElementos (Model model){
        model.addAttribute("titulo", "Ver Elementos");
        model.addAttribute("cuerpo", "Elementos Tecnológicos");
        List<Elemento> elem = se.Listar();
        model.addAttribute("datosElemento", elem);
        return "verelementos";
    }
    @GetMapping("/nuevoelemento")
    public String formAgregarElemento (Model model){
        model.addAttribute("titulo", "Nuevo Elemento");
        model.addAttribute("cuerpo", "Agregar Elemento Tecnológico");
        model.addAttribute("elemento", new Elemento());
        return "nuevoelemento";
    }
    @RequestMapping("/guardarelemento")
    public String guardarElemento(@ModelAttribute Elemento elem){
        se.guardar(elem);
        return "redirect:/verelementos";
    }
    @GetMapping("/editarelemento/{id}")
    public String editarElemento (@PathVariable("id") int id, Model model){
        model.addAttribute("elemento", se.editar(id));
        return "nuevoelemento";
    }

    @GetMapping("/eliminarelemento/{id}")
    public String eliminarElemento (@PathVariable("id") int id){
        se.eliminar(id);
        return "redirect:/verelementos";
    }
}

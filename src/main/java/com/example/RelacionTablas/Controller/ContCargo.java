package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.ICargoService;
import com.example.RelacionTablas.Model.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping
public class ContCargo {
    @Autowired
    private ICargoService serv;

    @GetMapping("/vercargos")
    public String verCargos (Model model){
        model.addAttribute("titulo", "Ver Cargos");
        model.addAttribute("cuerpo", "Cargos");
        List<Cargo> car = serv.Listar();
        model.addAttribute("datosCargo", car);
        return "index";
    }
    @GetMapping("/nuevocargo")
    public String formAgregarCargo (Model model){
        model.addAttribute("titulo", "Nuevo Cargo");
        model.addAttribute("cuerpo", "Agregar Cargo");
        model.addAttribute("cargo", new Cargo());
        return "nuevocargo";
    }

    @PostMapping("/guardarcargo")
    public String guardarCargo(@ModelAttribute Cargo car){
        serv.guardar(car);
        return "redirect:/vercargos";
    }
    @GetMapping("/editarcargo/{id}")
    public String editarCargo (@PathVariable("id") int id, Model model){
        model.addAttribute("cargo", serv.editar(id));
        return "nuevocargo";
    }
    @GetMapping("/eliminarcargo/{id}")
    public String eliminarCargo(@PathVariable("id") int id){
        serv.eliminar(id);
        return "redirect:/vercargos";
    }
}

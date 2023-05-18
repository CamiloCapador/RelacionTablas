package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.ICentroService;
import com.example.RelacionTablas.Model.Centro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ContCentro {
    @Autowired
    private ICentroService ser;

    @GetMapping("/vercentros")
    public String verCentros (Model model){
        model.addAttribute("titulo", "Ver Centros");
        model.addAttribute("cuerpo", "Centro De Costos");
        List<Centro> cen = ser.Listar();
        model.addAttribute("datosCentro", cen);
        return "vercentros";
    }

    @GetMapping("/nuevocentro")
    public String formAgregarCentro (Model model){
        model.addAttribute("titulo", "Nuevo Centro");
        model.addAttribute("cuerpo", "Agregar Centro De Costos");
        model.addAttribute("centro", new Centro());
        return "nuevocentro";
    }

    @PostMapping("/guardarcentro")
    public String guardarCentro(@ModelAttribute Centro cen){
        ser.guardar(cen);
        return "redirect:/vercentros";
    }

    @GetMapping("/editarcentro/{id}")
    public String editarCentro (@PathVariable("id") int id, Model model){
        model.addAttribute("centro", ser.editar(id));
        return "nuevocentro";
    }

    @GetMapping("/eliminarcentro/{id}")
    public String eliminarCentro (@PathVariable("id") int id){
        ser.eliminar(id);
        return "redirect:/vercentros";
    }
}

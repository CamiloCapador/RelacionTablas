package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.IEstadoElementoService;
import com.example.RelacionTablas.Interfaces.IEstadoElemento;
import com.example.RelacionTablas.Model.EstadoElemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ContEstadoElemento {

    @Autowired
    private IEstadoElementoService servi;

    @GetMapping("/verestadoelementos")
    public String verEstadoElementos (Model model){
        model.addAttribute("titulo", "Ver Estado Elementos");
        model.addAttribute("cuerpo", "Estado Elementos");
        List<EstadoElemento> estelem = servi.Listar();
        model.addAttribute("datosEstadoElemento", estelem);
        return "verestadoelementos";
    }

    @GetMapping("/nuevoestadoelemento")
    public String formAgregarEstadoElemento (Model model){
        model.addAttribute("titulo", "Nuevo Estado Elemento");
        model.addAttribute("cuerpo", "Agregar Estado De Elemento");
        model.addAttribute("estadoelemento", new EstadoElemento());
        return "nuevoestadoelemento";
    }

    @PostMapping("/guardarestadoelemento")
    public String guardarEstadoElemento (@ModelAttribute EstadoElemento estelem){
        servi.guardar(estelem);
        return "redirect:/verestadoelementos";
    }

    @GetMapping("/editarestadoelemento/{id}")
    public String editarEstadoElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("estadoelemento", servi.editar(id));
        return "nuevoestadoelemento";
    }

    @GetMapping("/eliminarestadoelemento/{id}")
    public String eliminarEstadoElemento(@PathVariable("id") int id){
        servi.eliminar(id);
        return "redirect:/verestadoelementos";
    }
}

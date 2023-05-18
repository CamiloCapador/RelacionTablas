package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.ITipoElementoService;
import com.example.RelacionTablas.Model.TipoElemento;
import com.example.RelacionTablas.Service.TipoElementoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ContTipoElemento {

    @Autowired
    private ITipoElementoService servic;

    @GetMapping("/vertipoelementos")
    public String verTipoElemento (Model model){
        model.addAttribute("titulo", "Ver Tipo Elemento");
        model.addAttribute("cuerpo", "Tipo Elemento");
        List<TipoElemento> tipoelem = servic.Listar();
        model.addAttribute("datosTipoElemento", tipoelem);
        return "vertipoelementos";
    }
    @GetMapping("/nuevotipoelemento")
    public String formAgregarTipoElemento (Model model){
        model.addAttribute("titulo", "Nuevo Tipo Elemento");
        model.addAttribute("cuerpo", "Agregar Tipo De Elemento");
        model.addAttribute("tipoelemento", new TipoElemento());
        return "nuevotipoelemento";
    }

    @PostMapping("/guardartipoelemento")
    public String guardarTipoElemento (@ModelAttribute TipoElemento tipoelem){
        servic.guardar(tipoelem);
        return "redirect:/vertipoelementos";
    }

    @GetMapping("/editartipoelemento/{id}")
    public String editarTipoElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("tipoelemento", servic.editar(id));
        return "nuevotipoelemento";
    }
    @GetMapping("/eliminartipoelemento/{id}")
    public String eliminarTipoElemento(@PathVariable("id") int id){
        servic.eliminar(id);
        return "redirect:/vertipoelementos";
    }
}


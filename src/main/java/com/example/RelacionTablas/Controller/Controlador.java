package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.ICargoService;
import com.example.RelacionTablas.IntService.IEmpleadoService;
import com.example.RelacionTablas.Model.Cargo;
import com.example.RelacionTablas.Model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping
public class Controlador {
    @Autowired
    private ICargoService serv;
    @Autowired
    private IEmpleadoService servicio;

    @GetMapping("/vercargos")
    public String verCargos (Model model){
        model.addAttribute("titulo", "Ver Cargos");
        model.addAttribute("cuerpo", "Cargos");
        List<Cargo> car = serv.Listar();
        model.addAttribute("datos", car);
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

    @GetMapping("/verempleados")
    public String verEmpleados (Model model){
        model.addAttribute("titulo", "Ver Empleados");
        model.addAttribute("cuerpo", "Empleados");
        List<Empleado> empl = servicio.Listar();
        model.addAttribute("informacion", empl);
        return "verempleados";
    }

    @GetMapping("/nuevoempleado")
    public String formAgregarEmpleado (Model model){
        model.addAttribute("titulo", "Nuevo Empleado");
        model.addAttribute("cuerpo", "Agregar Empleado");
        model.addAttribute("empleado", new Empleado());
        List<Cargo> car = serv.Listar();
        model.addAttribute("datos", car);
        return "nuevoempleado";
    }
    @PostMapping("/guardarempleado")
    public String guardarEmpleado(@ModelAttribute Empleado empl){
        servicio.guardar(empl);
        return "redirect:/verempleados";
    }

    @GetMapping("/editarempleado/{id}")
    public String editarEmpleado (@PathVariable("id") int id, Model model){
        model.addAttribute("empleado", servicio.editar(id));
        return "nuevoempleado";
    }
    @GetMapping("/eliminarempleado/{id}")
    public String eliminarEmpleado(@PathVariable("id") int id){
        servicio.eliminar(id);
        return "redirect:/verempleados";
    }
}

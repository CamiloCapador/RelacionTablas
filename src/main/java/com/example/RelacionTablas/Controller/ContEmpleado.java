package com.example.RelacionTablas.Controller;

import com.example.RelacionTablas.IntService.ICargoService;
import com.example.RelacionTablas.IntService.ICentroService;
import com.example.RelacionTablas.IntService.IEmpleadoService;
import com.example.RelacionTablas.Model.Cargo;
import com.example.RelacionTablas.Model.Centro;
import com.example.RelacionTablas.Model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ContEmpleado {

    @Autowired
    private IEmpleadoService servicio;
    @Autowired
    private IEmpleadoService servicioDos;

    @Autowired
    private ICargoService serv;

    @Autowired
    private ICentroService ser;

    @GetMapping("/verempleados")
    public String verEmpleados (Model model){
        model.addAttribute("titulo", "Ver Colaborador");
        model.addAttribute("cuerpo", "Colaboradores");
        List<Empleado> empl = servicio.Listar();
        model.addAttribute("datosEmpleado", empl);
        return "verempleados";
    }

    @GetMapping("/nuevoempleado")
    public String formAgregarEmpleado (Model model){
        model.addAttribute("titulo", "Nuevo Colaborador");
        model.addAttribute("cuerpo", "Agregar Colaborador");
        model.addAttribute("empleado", new Empleado());
        List<Cargo> car = serv.Listar();
        model.addAttribute("datosCargo", car);
        List<Centro> cen = ser.Listar();
        model.addAttribute("datosCentro", cen);
        return "nuevoempleado";
    }

    @PostMapping("/guardarempleado")
    public String guardarEmpleado(@ModelAttribute Empleado empl){
        servicio.guardar(empl);
        return "redirect:/verempleados";
    }

    @GetMapping("/editarempleado/{id}")
    public String editarEmpleado (@PathVariable("id") int id, Model model){
        model.addAttribute("empleado", servicioDos.editar(id));
        return "nuevoempleado";
    }

    @GetMapping("/eliminarempleado/{id}")
    public String eliminarEmpleado(@PathVariable("id") int id){
        servicioDos.eliminar(id);
        return "redirect:/verempleados";
    }
}

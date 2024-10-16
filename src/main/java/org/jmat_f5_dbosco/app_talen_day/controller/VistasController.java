package org.jmat_f5_dbosco.app_talen_day.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VistasController {

    @GetMapping("/")
    public String index() {
        return "index";  
    }

    @GetMapping("/menu.html")
    public String menu() {
        return "menu.html"; 
    }
    @GetMapping("/ficha_empresas.html")
    public String fichaEmpresas() {
        return "ficha_empresas.html"; 
    }

    /*  Ruta para otras página
    @GetMapping("/otras")
    public String otras() {
        return "otras"; 
    }*/
}

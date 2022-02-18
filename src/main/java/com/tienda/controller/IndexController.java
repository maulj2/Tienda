package com.tienda.controller;

import com.tienda.dao.ClienteDao;
import com.tienda.model.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String Inicio(Model model){
        log.info("Se muestra el index de templates");
        
        //Cliente cliente1 = new Cliente("Pedro", "Contreras", "pcontreras@gmail.com", "8787867");
        //Cliente cliente2 = new Cliente("Saul", "Gomez", "sgomez@gmail.com", "87584857");
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes", clientes);
        
    return "index";
}
}

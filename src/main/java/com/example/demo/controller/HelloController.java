/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.service.servicioPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * 
 */
@Controller
public class HelloController {
    
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index";
    }

    @GetMapping("/hola")
    public String pagina() {
        return "pagina";
    }

    @GetMapping("/servicioPrueba1")
    public String servicio() {

        return "servicio";
    }
    
        
    
    
}

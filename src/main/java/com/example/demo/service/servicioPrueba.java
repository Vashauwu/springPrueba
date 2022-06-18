/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.service;

import com.example.demo.controller.RequestParamController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author veron
 */
@Service
public class servicioPrueba {
   
    String mensaje;

    public String holaService(String nombre, String pass) {
        if (nombre.equals("Kevin") && pass.equals("1234")) {
            
            return "correcto";
        } else {
            
            return "incorrecto";
        }
        
    }
}

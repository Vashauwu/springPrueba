/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import com.example.demo.service.servicioPrueba;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author adrian
 */
@Controller
@RequestMapping("/parametrosURL")
public class RequestParamController {

    private final servicioPrueba prueba;

    @Autowired
    public RequestParamController(servicioPrueba prueba) {
        this.prueba = prueba;
    }
    private static final String TEMPLATE_VIEW = "servicio";
    private static final String TEMPLATE_VIEW1 = "correcto";
    private static final String TEMPLATE_VIEW2 = "incorercto";

    @GetMapping("/servicioPrueba2")
    public ModelAndView getRequest(@RequestParam(name = "name") String nombreReq,
            @RequestParam(name = "pass") String pass,
            @RequestParam(name = "email") String email) {
        if (prueba.holaService(nombreReq, pass).equals("correcto")) {
            ModelAndView mav = new ModelAndView(TEMPLATE_VIEW1);
            mav.addObject("dato_nombre", nombreReq);
            mav.addObject("dato_pass", pass);
            mav.addObject("dato_email", email);
            return mav;
        } else {

            ModelAndView mav = new ModelAndView(TEMPLATE_VIEW2);
            mav.addObject("dato_nombre", nombreReq);
            mav.addObject("dato_pass", pass);
            mav.addObject("dato_email", email);
            mav.addObject("dato_mensaje", prueba.holaService(nombreReq, pass));
            return mav;

        }
    }

}

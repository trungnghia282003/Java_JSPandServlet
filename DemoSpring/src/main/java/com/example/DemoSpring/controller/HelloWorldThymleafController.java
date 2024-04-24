/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.DemoSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author PC
 */
@Controller
public class HelloWorldThymleafController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",
            defaultValue = "World", required = true) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}

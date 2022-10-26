package com.board.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class smarteditorController {

    @RequestMapping("/smarteditor")
    public String smartEditor(){
        return "smartEditor";
    }
}

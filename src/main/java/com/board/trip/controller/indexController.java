package com.board.trip.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tripInfoBoard")
    public String tripInfoBoard_move(){
        return "tripInfoBoard";
    }

    @GetMapping("/tripReview")
    public String tripReview_Move(){
        return "review";
    }
}

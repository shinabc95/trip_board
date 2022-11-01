package com.board.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tripInfoBoard")
public class tripInfoBoardController {

    @GetMapping("/tripInfoWrite")
    public String tripInfoWrite_move(){
        return "tripInfoWrite";
    }
}

package com.board.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class tripInfoBoardController {

    @GetMapping("/tripInfoBoard/tripInfoWrite")
    public String tripInfoWrite_move(){
        return "tripInfoWrite";
    }
}

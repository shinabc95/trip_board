package com.board.trip.controller;

import com.board.trip.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
public class tripInfoBoardController {

    //private final PostService postService;

    /*@GetMapping("/tripInfoBoard")
    public String main(Model model){
        model.addAttribute("post", postService.findAllDesc());
        return "tripInfoBoard";
    }*/

    @GetMapping("/tripInfoBoard/tripInfoWrite")
    public String tripInfoWrite_move(){
        return "tripInfoWrite";
    }
}

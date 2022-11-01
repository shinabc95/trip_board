package com.board.trip.controller;


import com.board.trip.Service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class indexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    private final PostService postService;
    @GetMapping("/tripInfoBoard")
    public String tripInfoBoard_move(Model model){
        model.addAttribute("post", postService.findAllDesc());
        return "tripInfoBoard";
    }

    @GetMapping("/tripReview")
    public String tripReview_Move(){
        return "review";
    }
}

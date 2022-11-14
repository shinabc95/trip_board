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

    private final PostService postService;

    /*@GetMapping("/tripInfoBoard")
    public String main(Model model){
        model.addAttribute("post", postService.findAllDesc());
        return "tripInfoBoard";
    }*/

    @GetMapping("/tripInfoBoard/tripInfoWrite")
    public String tripInfoWrite_move(){
        return "tripInfoWrite";
    }

    @GetMapping("/tripInfoBoard/tripInfoRead")
    public String tripInfoRead_move(Model model){
        model.addAttribute("post", postService.findAllDesc()); 이거 아이디 값 참조해서 그 아이디 값에 맞는 데이터만 가져오게 해야함.
        return "tripInfoRead";
    }
}

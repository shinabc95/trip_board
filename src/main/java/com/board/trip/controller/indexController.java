package com.board.trip.controller;


import com.board.trip.service.reviewposts.ReviewPostsService;
import com.board.trip.web.dto.ReviewPostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@RequiredArgsConstructor
public class indexController {

    private final ReviewPostsService reviewPostsService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/tripInfoBoard")
    public String tripInfoBoard_move(){
        return "tripInfoBoard";
    }

    @GetMapping("/tripReview")
    public String tripReview_Move(Model model){
        model.addAttribute("posts", reviewPostsService.findAllDesc());
        return "review";
    }

    @GetMapping("/login")
    public String loginPageMove() { return "login";}

    @GetMapping("/reviewposts/{id}")
    public String reviewPageMove(@PathVariable Long id, Model model) {
        ReviewPostsResponseDto dto = reviewPostsService.findById(id);
        model.addAttribute("posts", dto);

        return "reviewBoard"; }
}

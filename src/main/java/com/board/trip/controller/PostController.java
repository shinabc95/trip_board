package com.board.trip.controller;

import com.board.trip.Service.PostService;
import com.board.trip.Service.PostServiceImpl;
import com.board.trip.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RequestMapping("/api/v1/post")
@RestController
public class PostController {

    private final PostServiceImpl postService;

/*    @GetMapping("/getPostList")
    public List<Post> getPostList(){
        return postService.getPostList();
    }*/

/*    @GetMapping("/saveTripInfo")
    public void saveTripInfo(Post post){
        System.out.println("saveTripInfo");
        postService.saveTripInfo(post);
    }*/
}
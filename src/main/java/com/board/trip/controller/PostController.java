package com.board.trip.controller;

import com.board.trip.Service.PostService;
import com.board.trip.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("smarteditor")
public class PostController {

    @Autowired
    PostService postService;

    @RequestMapping("/")
    public ModelAndView insertEditor(HttpServletRequest httpServletRequest, ModelMap modelMap) throws Exception{
        ModelAndView modelAndView = new ModelAndView("smarteditor/newPost");
        return modelAndView;
    }

    @RequestMapping("/savePost")
    public View savePost(HttpServletRequest httpServletRequest, Post post) throws Exception{
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("result", HttpStatus.OK);

        postService.savePost(post);
        return new MappingJackson2JsonView();
    }
}

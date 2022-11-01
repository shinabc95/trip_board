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
@RequestMapping("/tripInfoBoard/tripInfoWrite")
public class tripInfoWriteController {

    @Autowired
    PostService postService;

    /*@GetMapping("/")
    public String tripInfoWrite_move(){
        return "tripInfoWrite";
    }*/

    @RequestMapping("/smarteditor")
    public String smartEditor(){
        return "smartEditor";
    }

    @RequestMapping("/")
    public ModelAndView insertEditor(HttpServletRequest req, ModelMap model) throws Exception {
        ModelAndView mav = new ModelAndView("smarteditor/newPost");

        return mav;
    }

    @RequestMapping("/saveTripInfo")
    public View saveTripInfo(HttpServletRequest req, Post post) throws Exception {

        ModelMap model = new ModelMap();
        model.addAttribute("result", HttpStatus.OK);

        postService.saveTripInfo(post);

        return new MappingJackson2JsonView();
    }

}
package com.board.trip.controller;

import com.board.trip.service.reviewposts.ReviewPostsService;
import com.board.trip.web.dto.ReviewPostsResponseDto;
import com.board.trip.web.dto.ReviewPostsSaveRequestDto;
import com.board.trip.web.dto.ReviewPostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class ReviewPostsApiController {
    private final ReviewPostsService postsService;

    @PostMapping("/api/v1/reviewposts")
    public Long save(@RequestBody ReviewPostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/reviewposts/{id}")
    public Long update(@PathVariable Long id, @RequestBody ReviewPostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/reviewposts/{id}")
    public ReviewPostsResponseDto findById (@PathVariable Long id) {
        return postsService.findById(id);
    }

    @DeleteMapping("api/v1/reviewposts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }
}


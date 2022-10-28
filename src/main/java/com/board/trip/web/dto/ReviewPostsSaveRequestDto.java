package com.board.trip.web.dto;

import com.board.trip.domain.reviewposts.ReviewPosts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewPostsSaveRequestDto {
    private String title;
    private String content;
    private String author;
    @Builder
    public ReviewPostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public ReviewPosts toEntity(){
        return ReviewPosts.builder().title(title).content(content).author(author).build();
    }
}

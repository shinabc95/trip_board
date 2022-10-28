package com.board.trip.web.dto;

import com.board.trip.domain.reviewposts.ReviewPosts;
import lombok.Getter;

@Getter
public class ReviewPostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public ReviewPostsResponseDto (ReviewPosts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.author = getAuthor();
    }
}

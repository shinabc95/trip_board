package com.board.trip.web.dto;

import com.board.trip.domain.reviewposts.ReviewPosts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ReviewPostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public ReviewPostsListResponseDto(ReviewPosts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        //this.modifiedDate = entity.getModifiedDate();
    }
}

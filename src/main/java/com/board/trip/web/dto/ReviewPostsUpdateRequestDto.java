package com.board.trip.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ReviewPostsUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public ReviewPostsUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}

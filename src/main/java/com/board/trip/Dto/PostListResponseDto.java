package com.board.trip.Dto;

import com.board.trip.model.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostListResponseDto {
    private Long _id;
    private String title;
    private String content;
    private String city;
    private String district;
    private String detailedAddress;
    private String tripInfoBoardRegTime;
    private String tripInfoBoardModifiedTime;

    public PostListResponseDto(Post post){
        this._id = post.get_id();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.city = post.getCity();
        this.district = post.getDistrict();
        this.detailedAddress = post.getDetailedAddress();
        this.tripInfoBoardRegTime = post.getTripInfoBoardRegTime().toString();
        // LocalDateTime 값을 문자열로 변환하면 날짜와 시간 사이에 T가 껴있어 T를 기준으로 split했다.
        this.tripInfoBoardModifiedTime = post.getTripInfoBoardModifiedTime().toString().split("T")[0];
    }
}

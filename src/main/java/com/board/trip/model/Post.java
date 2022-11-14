package com.board.trip.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity(name = "post")
public class Post extends BaseTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long _id;

    @Column(columnDefinition = "TEXT")
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    @Column(columnDefinition = "TEXT")
    private String city;
    @Column(columnDefinition = "TEXT")
    private String district;
    @Column(columnDefinition = "TEXT")
    private String detailedAddress;

    @Builder
    public Post(Long _id, String title, String content, String city, String district, String detailedAddress){
        this._id = get_id();
        this.title = getTitle();
        this.content = getContent();
        this.city = getCity();
        this.district = getDistrict();
        this.detailedAddress = getDetailedAddress();
    }
}
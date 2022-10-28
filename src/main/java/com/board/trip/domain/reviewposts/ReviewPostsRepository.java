package com.board.trip.domain.reviewposts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewPostsRepository extends JpaRepository<ReviewPosts, Long> {

    @Query("SELECT p FROM ReviewPosts p ORDER BY p.id DESC")
    List<ReviewPosts> findAllDesc();
}

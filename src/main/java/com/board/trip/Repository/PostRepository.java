package com.board.trip.Repository;

import com.board.trip.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    // JPA에서 기본으로 제공되는 메소드는 선언없이 사용 가능하다.
    @Query("SELECT p FROM post p ORDER BY p._id DESC")
    List<Post> findAllDesc();
}

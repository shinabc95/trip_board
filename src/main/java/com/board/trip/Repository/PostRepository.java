package com.board.trip.Repository;

import com.board.trip.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, String > {
    // JPA에서 기본으로 제공되는 메소드는 선언없이 사용 가능하다.
}

package com.board.trip.Service;

import com.board.trip.Repository.PostRepository;
import com.board.trip.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public void savePost(Post post) throws SQLException {
        postRepository.save(post);
    }
}

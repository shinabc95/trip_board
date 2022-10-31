package com.board.trip.Service;

import com.board.trip.Repository.PostRepository;
import com.board.trip.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    // 여행지 정보 저장
    @Override
    public void saveTripInfo(Post post) throws SQLException {
        postRepository.save(post);
    }
}

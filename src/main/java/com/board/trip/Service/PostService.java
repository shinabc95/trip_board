package com.board.trip.Service;

import com.board.trip.Dto.PostListResponseDto;
import com.board.trip.Repository.PostRepository;
import com.board.trip.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    // 여행지 정보 저장
    public void saveTripInfo(Post post) throws SQLException {
        postRepository.save(post);
    }

    @Transactional(readOnly = true)
    public List<PostListResponseDto> findAllDesc(){
        return postRepository.findAllDesc().stream().map(PostListResponseDto::new) // == .map(post -> new PostListResponseDto(post))
                .collect(Collectors.toList());
    }
}

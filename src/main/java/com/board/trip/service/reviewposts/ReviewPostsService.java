package com.board.trip.service.reviewposts;

import com.board.trip.domain.reviewposts.ReviewPosts;
import com.board.trip.domain.reviewposts.ReviewPostsRepository;
import com.board.trip.web.dto.ReviewPostsListResponseDto;
import com.board.trip.web.dto.ReviewPostsResponseDto;
import com.board.trip.web.dto.ReviewPostsSaveRequestDto;
import com.board.trip.web.dto.ReviewPostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ReviewPostsService {
    private final ReviewPostsRepository postsRepository;

    @Transactional
    public Long save(ReviewPostsSaveRequestDto
                             requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, ReviewPostsUpdateRequestDto requestDto) {
        ReviewPosts posts = postsRepository.findById(id).orElseThrow(() -> new
                IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public ReviewPostsResponseDto findById (Long id){
        ReviewPosts entity = postsRepository.findById(id).orElseThrow(() -> new
                IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new ReviewPostsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<ReviewPostsListResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().stream().map(ReviewPostsListResponseDto::new).collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id) {
        ReviewPosts posts = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));
        postsRepository.delete(posts);

    }
}

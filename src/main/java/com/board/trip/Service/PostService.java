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
        List<PostListResponseDto> postListResponseDtoList =  postRepository.findAllDesc().stream().map(PostListResponseDto::new) // == .map(post -> new PostListResponseDto(post))
                .collect(Collectors.toList());
        for (int i=0; i < postListResponseDtoList.size(); i++){
            PostListResponseDto postListResponseDto = postListResponseDtoList.get(i);
            System.out.println("qwrqwwqd: "+postListResponseDtoList.get(i).get_id()
                    +"\n"+postListResponseDto.getTitle()
                    +"\n"+postListResponseDto.getContent()
                    +"\n"+postListResponseDto.getCity()
                    +"\n"+postListResponseDto.getDetailedAddress()
                    +"\n"+postListResponseDto.getTripInfoBoardRegTime()
                    +"\n"+postListResponseDto.getTripInfoBoardModifiedTime());
        }
        return postListResponseDtoList;
    }
}

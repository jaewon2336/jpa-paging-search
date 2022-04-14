package site.metacoding.pagingsearch.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import site.metacoding.pagingsearch.domain.Post;
import site.metacoding.pagingsearch.domain.PostRepository;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public Page<Post> 글목록보기(String keyword, Pageable pageable) {
        return postRepository.findByTitleContaining(keyword, pageable);
    }

}

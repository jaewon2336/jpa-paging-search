package site.metacoding.pagingsearch.web;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.pagingsearch.domain.Post;
import site.metacoding.pagingsearch.service.PostService;

@RequiredArgsConstructor
@RestController
public class PostApiController {

    private final PostService postService;

    // @GetMapping("/api/list")
    // public ResponseEntity<?> findAll() {

    // List<Post> posts = postService.글목록보기();

    // return new ResponseEntity<>(posts, HttpStatus.OK);
    // }

    @GetMapping("/api/list")
    public ResponseEntity<?> list(String keyword, Integer page,
            @PageableDefault(size = 5, sort = "id", direction = Sort.Direction.DESC) Pageable pageable) {

        // System.out.println("pageable : " + pageable.getPageNumber());
        // System.out.println("page : " + page);

        Page<Post> posts = postService.글목록보기(keyword, pageable);

        // System.out.println("잘왔어? " + posts);
        // System.out.println("잘왔어? " + posts.getSize());

        return new ResponseEntity<>(posts, HttpStatus.OK);
    }
}

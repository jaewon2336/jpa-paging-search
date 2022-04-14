package site.metacoding.pagingsearch.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    @Query(value = "SELECT * FROM post WHERE title like %:keyword%", nativeQuery = true)
    Page<Post> findByTitleContaining(@Param("keyword") String keyword, Pageable pageable);
}

package week3.solo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import week3.solo1.domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    @Query("select distinct p from Post p left join fetch Comment c where p.id = :postId")
    Optional<List<Post>> findPostByIdWithComment(@Param("postId") Long postId);

    @Query("select p from Post p order by p.createdTime desc ")
    List<Post> findAll();
}

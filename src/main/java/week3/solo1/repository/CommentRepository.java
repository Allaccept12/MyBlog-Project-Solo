package week3.solo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import week3.solo1.domain.Comment;

public interface CommentRepository extends JpaRepository<Comment,Long> {


}

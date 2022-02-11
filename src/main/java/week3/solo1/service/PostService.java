package week3.solo1.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import week3.solo1.domain.Post;
import week3.solo1.repository.CommentRepository;
import week3.solo1.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public List<Post> findAll() {
        return Optional.of(postRepository.findAll()).orElseThrow(NullPointerException::new);
    }

//    public Post findByPost(Long postId) {
//        return Post;
//    }


}

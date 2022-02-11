package week3.solo1.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import week3.solo1.dto.CreatePostRequestDto;
import week3.solo1.dto.UpdatePostRequestDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private final List<Comment> comments = new ArrayList<>();

    @Builder
    public Post(CreatePostRequestDto createDto) {
        this.title = createDto.getTitle();
        this.content = createDto.getContent();
        this.name = createDto.getName();
    }

    public void updatePost(UpdatePostRequestDto updateRequestDto) {
        this.title = updateRequestDto.getTitle();
        this.name = updateRequestDto.getName();
        this.content = updateRequestDto.getContent();
    }

}











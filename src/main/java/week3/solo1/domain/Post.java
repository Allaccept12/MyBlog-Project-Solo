package week3.solo1.domain;


import com.sun.tools.javac.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;
import week3.solo1.dto.PostCreateDto;
import week3.solo1.dto.PostCreateRequestDto;
import week3.solo1.dto.PostUpdateRequestDto;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Post extends Timestamped {

    @Id
    @GeneratedValue
    @Column("post_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn("account_id")
    private Account account;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Post(PostCreateRequestDto createDto) {
        this.title = createDto.getTitle();
        this.content = createDto.getContent();
        this.account.getPosts().add(this);
    }

    public void updatePost(PostUpdateRequestDto updateRequestDto) {
        this.title = updateRequestDto.getTitle();
        this.account.updateAccount(updateRequestDto.getName());
        this.content = updateRequestDto.getContent();
    }

    public void deletePost() {
        this.account.getPosts().remove(this);
    }

}











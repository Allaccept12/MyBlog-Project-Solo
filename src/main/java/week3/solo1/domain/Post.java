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
    @GeneratedValue
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Post(CreatePostRequestDto createDto, Account account) {
        this.title = createDto.getTitle();
        this.content = createDto.getContent();
        this.account = account;
        this.account.getPosts().add(this);
    }

    public void updatePost(UpdatePostRequestDto updateRequestDto) {
        this.title = updateRequestDto.getTitle();
        this.account.updateAccount(updateRequestDto.getName());
        this.content = updateRequestDto.getContent();
    }

    public void deletePost() {
        this.account.getPosts().remove(this);
    }

}











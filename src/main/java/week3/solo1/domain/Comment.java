package week3.solo1.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import week3.solo1.dto.CommentRequestDto;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "comment_id")
    private Long id;

    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id'")
    private Post post;


    @Builder
    public Comment(CommentRequestDto dto, Post post) {
        this.content = dto.getContent();
        this.post = post;
        this.post.getComments().add(this);
    }

    public void updateComment(CommentRequestDto dto) {
        this.content = dto.getContent();
    }

    public void deleteComment() {
        this.post.getComments().remove(this);
    }


}

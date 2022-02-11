package week3.solo1.domain;
import lombok.*;
import week3.solo1.dto.JoinAccountRequestDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    @Id
    @GeneratedValue
    @Column(name = "account_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Account(JoinAccountRequestDto account) {
        this.name = account.getName();
    }

    public void updateAccount(String name) {
        this.name = name;
    }


}

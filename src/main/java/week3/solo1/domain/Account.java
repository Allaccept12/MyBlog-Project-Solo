package week3.solo1.domain;


import com.sun.tools.javac.util.List;
import lombok.*;
import week3.solo1.dto.AccountJoinRequestDto;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Account {

    @Id
    @GeneratedValue
    @Column("account_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @Builder
    public Account(AccountJoinRequestDto account) {
        this.name = account.getName();
    }

    public void updateAccount(String name) {
        this.name = name;
    }


}

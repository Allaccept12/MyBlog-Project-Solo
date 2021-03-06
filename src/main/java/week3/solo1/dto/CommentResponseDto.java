package week3.solo1.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommentResponseDto {

    private String account_id;
    private Long comment_id;
    private String content;
    private LocalDateTime createTime;


}

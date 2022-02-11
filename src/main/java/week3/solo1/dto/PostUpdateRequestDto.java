package week3.solo1.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
public class PostUpdateRequestDto {

    private String title;
    private String name;
    private String content;
}

package week3.solo1.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class JoinAccountRequestDto {

    private String name;

}

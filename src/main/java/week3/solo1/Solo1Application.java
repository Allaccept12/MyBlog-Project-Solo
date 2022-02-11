package week3.solo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //생성일자, 수정일자 자동 업뎃
@SpringBootApplication
public class Solo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Solo1Application.class, args);
	}

}

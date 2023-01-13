package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	/*
	// 메시지 관리 기능 (스프링부트가 기본 제공함)
	@Bean
	public MessageSource messageSource() {
		// 기본 MessageSource 구현체
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		// resources 폴더의 'messages', 'errors'  라는 설정 파일을 읽어서 사용
		messageSource.setBasenames("messages", "errors");
		messageSource.setDefaultEncoding("utf-8");
		return messageSource;
	}
	*/

}

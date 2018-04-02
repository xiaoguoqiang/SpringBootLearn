package demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by liqianga on 2018/3/28.
 */
@SpringBootApplication
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SpringApplication.DEFAULT_CONTEXT_CLASS);
        springApplication.setBannerMode(Banner.Mode.OFF);
        SpringApplication.run(TestApplication.class, args);
    }

}

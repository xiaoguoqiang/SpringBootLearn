package demo.servlet;

import demo.TestApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        builder.sources(TestApplication.class);
        builder.bannerMode(Banner.Mode.OFF);
        return builder;
    }
}

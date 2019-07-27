package com.agnaldo4j.kanban.simulator;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder()
                .bannerMode(Banner.Mode.OFF)
                .sources(App.class)
                .run(args);

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }
}

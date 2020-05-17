package ru.unpunished.yakovlev.tabletop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("ru.unpunished.yakovlev.tabletop.Repository")
public class TabletopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TabletopApplication.class, args);
    }

}

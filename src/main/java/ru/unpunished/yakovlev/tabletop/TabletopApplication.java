package ru.unpunished.yakovlev.tabletop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import ru.unpunished.yakovlev.tabletop.UtilGame.Dices.PresetDice;

@SpringBootApplication
@EnableJpaRepositories("ru.unpunished.yakovlev.tabletop.Repository")
public class TabletopApplication {

    public static void main(String[] args) {
        SpringApplication.run(TabletopApplication.class, args);
    }

}

@Configuration
@EnableWebMvc
class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}

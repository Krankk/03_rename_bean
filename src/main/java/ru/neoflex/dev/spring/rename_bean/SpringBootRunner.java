package ru.neoflex.dev.spring.rename_bean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import ru.neoflex.dev.spring.rename_bean.stuff.ShapeShifter;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {

        SpringApplication.run(SpringBootRunner.class, args);


    }
}

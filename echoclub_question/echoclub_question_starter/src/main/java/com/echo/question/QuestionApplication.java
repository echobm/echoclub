package com.echo.question;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//刷题微服务启动类
@SpringBootApplication
@ComponentScan("com.echo")
@MapperScan("com.echo.**.mapper")
public class QuestionApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuestionApplication.class);
    }
}

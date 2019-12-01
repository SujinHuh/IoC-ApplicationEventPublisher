package me.whiteship.demospring51;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync// @Async //비동기적으로 사용하고싶다. 당연히 순서는 보장이 안됨
public class Demospring51Application {
    public static void main(String[] args) {
        SpringApplication.run(Demospring51Application.class,args);
    }
 }



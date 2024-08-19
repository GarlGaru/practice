package com.ohgiraffers.crud;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.ohgiraffers.crud.menu")
@MapperScan(basePackages = "com.ohgiraffers.crud.menu", annotationClass = Mapper.class)
public class Chap08crudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chap08crudApplication.class, args);
    }

}

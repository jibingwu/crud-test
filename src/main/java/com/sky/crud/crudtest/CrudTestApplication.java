package com.sky.crud.crudtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.sky.crud.crudtest.mapper")
public class CrudTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudTestApplication.class, args);
    }

    //开发版本
    public  void  test1(){

    }


}

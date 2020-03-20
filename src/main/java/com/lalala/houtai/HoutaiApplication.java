package com.lalala.houtai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lalala.houtai.mapper")
public class HoutaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HoutaiApplication.class, args);
    }

}

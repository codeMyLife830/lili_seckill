package com.learning.lili_seckill;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.learning.lili_seckill.pojo")
public class LiliSeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiliSeckillApplication.class, args);
    }

}

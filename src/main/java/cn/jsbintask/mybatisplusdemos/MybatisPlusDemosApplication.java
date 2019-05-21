package cn.jsbintask.mybatisplusdemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisPlusDemosApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MybatisPlusDemosApplication.class, args);

        System.in.read();
    }

}

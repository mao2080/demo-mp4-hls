package com.demo.mediaconvert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author mao2080
 */
@SpringBootApplication(scanBasePackages = {"com.demo"})
@EnableCaching
public class HlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlsApplication.class, args);
        System.out.println("http://localhost:8080/api/apiVersionController/test");
        System.out.println("https://blog.csdn.net/qq_34882032/article/details/117136958");
    }

}

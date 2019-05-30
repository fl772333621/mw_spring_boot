package com.mfanw.test.mw_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan // 添加该行才会主动去搜索servlet和filter配置
public class MwSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MwSpringBootApplication.class, args);
    }
}

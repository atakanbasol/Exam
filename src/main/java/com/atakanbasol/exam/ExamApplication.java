package com.atakanbasol.exam;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import java.util.TimeZone;

//SECURITY EXCLUDE
@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
        //org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        //org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
//@SpringBootApplication
public class ExamApplication {
    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("IST"));
    }

    public static void main(String[] args) {
        //Disables headless JOptionPane
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(ExamApplication.class, args);
    }

}

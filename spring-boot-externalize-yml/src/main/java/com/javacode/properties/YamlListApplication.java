package com.javacode.properties;

import com.javacode.properties.yamllist.prop.ApplicationProps;
import com.javacode.properties.yamllist.prop.UserProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YamlListApplication implements CommandLineRunner {

    @Autowired
    private ApplicationProps applicationProps;

    @Autowired
    private UserProps userProps;

    @Override
    public void run(String... args) {
        System.out.println("Application profile and properties =  " + applicationProps);
        System.out.println("user details =  " + userProps);
    }

    public static void main(String[] args) {
        SpringApplication.run(YamlListApplication.class, args);
    }

}

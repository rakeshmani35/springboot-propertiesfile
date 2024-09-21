package com.javacode.properties;

import com.javacode.properties.yamlmap.prop.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapFromYaml implements CommandLineRunner {

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) {
        System.out.println("Application MAP YML ==>>  " + serverProperties);
    }

    public static void main(String[] args) {
        SpringApplication.run(MapFromYaml.class, args);
    }

}

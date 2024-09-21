package com.javacode.api.config;

import com.javacode.api.model.Employee;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Configuration
@Component
@ConfigurationProperties
public class EmployeeConfig {

    private List<Employee> employees;

}

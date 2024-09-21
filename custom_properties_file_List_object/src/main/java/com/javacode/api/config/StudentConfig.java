package com.javacode.api.config;

import com.javacode.api.model.Student;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@Component
@Configuration
@PropertySource("classpath:/student/student.yml")
@ConfigurationProperties
public class StudentConfig {

    private List<Student> students;

}

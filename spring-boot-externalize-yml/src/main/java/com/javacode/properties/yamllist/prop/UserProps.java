package com.javacode.properties.yamllist.prop;

import com.javacode.properties.ymlfactory.YamlPropertySourceFactory;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Setter
@Getter
@ToString
@Component
@PropertySource(value = "classpath:server/user.yml", factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "user-details")
public class UserProps {

    private List<User> users;

    @Setter
    @Getter
    @ToString
    public static class User {

        private String username;
        private String password;
        private List<String> roles;

    }
}

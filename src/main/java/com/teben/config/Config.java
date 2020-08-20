package com.teben.config;

import com.teben.model.Car;
import com.teben.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.teben")
public class Config {

    @Bean
    public User user() {
        return new User("Artur", 20, "Lviv");
    }

    @Bean
    public Car car() {
        return new Car("BMW", 2008, "Black", user());
    }
}

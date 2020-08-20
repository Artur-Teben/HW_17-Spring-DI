package com.teben.executor;

import com.teben.config.Config;
import com.teben.model.Car;
import com.teben.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Executor {
    public void executeApplication() {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);

        User user = context.getBean("user", User.class);
        Car car = context.getBean("car", Car.class);

        System.out.println(user);
        System.out.println(car);

        context.close();
    }
}

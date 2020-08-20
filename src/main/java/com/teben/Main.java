package com.teben;

import com.teben.config.Config;
import com.teben.executor.Executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(Config.class);

        Executor executor = context.getBean(Executor.class);
        executor.executeApplication();

        context.close();
    }
}

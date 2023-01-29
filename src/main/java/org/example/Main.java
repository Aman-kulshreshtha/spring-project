package org.example;

import org.example.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // We have added a AppConfig class to provide configurations to spring

        // now Spring can scan the package org.example to find components
        // components are classes whose lifecycle will be managed by spring (Inversion Of Control)
        // getting context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //dependancy injection
        Car myCar1 = context.getBean("honda", Car.class);
        Car myCar2 = context.getBean("swift",Car.class);

        System.out.println(myCar1.specifications());
        System.out.println(myCar2.specifications());

    }
}
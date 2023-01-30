package org.example;

import org.example.cars.Honda;
import org.example.cars.Swift;
import org.example.specs.V6;
import org.example.specs.V8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    // we can get rid of all @Component annotations and write them here using @Bean annotation as follows:
    // this is called spring bean
    @Bean
    public Honda honda() {
        return new Honda();
    }

    @Bean
    public Swift swift() {
        return new Swift();
    }

    @Bean
    public V6 v6() {
        return new V6();
    }

    @Bean
    public V8 v8() {
        return new V8();
    }
}

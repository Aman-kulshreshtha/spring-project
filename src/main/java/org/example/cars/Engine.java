package org.example.cars;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
    String version;

    public Engine() {
        version="v8";
    }
 }

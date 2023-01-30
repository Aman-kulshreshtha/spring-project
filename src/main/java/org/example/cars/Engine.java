package org.example.cars;

import org.springframework.stereotype.Component;

@Component("engine")
public class Engine {
    String version;

    public Engine() {
        version ="v8";
    }
// can't use this with @Autowired annotation at Engine engine;
//    public Engine(String type) {
//        version=type;
//    }


 }

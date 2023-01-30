package org.example.specs;

import org.example.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component
public class V6 implements Engine {
    @Override
    public String version() {
        return "v6 engine";
    }
}

package org.example.cars;

import org.example.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {
    @Override
    public String specifications() {
        return "specs of swift";
    }
}

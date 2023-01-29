package org.example.cars;

import org.example.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("honda")
public class Honda implements Car {

    @Override
    public String specifications() {
        return "specs of Honda";
    }
}

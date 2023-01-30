package org.example.cars;

import org.example.interfaces.Car;
import org.example.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class Swift implements Car {

    //clearly this is another class and in order to fully invert the control to spring this object should also be
    //managed by spring so we do autowired notation here

    // therefore don't do Engine engine = new Engine();
    //@Autowired

    @Autowired(required = false)
    //Engine v8; instead of doing this use @Qualifier annotation
    @Qualifier("v8")
    Engine engine;


    @Override
    public String specifications() {
        return "specs of swift with engine version: "+engine.version();
    }
}

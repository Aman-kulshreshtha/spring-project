package org.example.interfaces;

import org.springframework.stereotype.Component;

@Component("engine")
public interface Engine {
    public String version();

 }

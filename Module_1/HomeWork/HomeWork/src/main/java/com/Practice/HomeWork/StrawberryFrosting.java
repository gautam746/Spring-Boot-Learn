package com.Practice.HomeWork;

import com.Practice.HomeWork.Interfaces.Frosting;
import org.springframework.stereotype.Component;

@Component
public class StrawberryFrosting implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}

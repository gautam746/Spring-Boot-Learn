package com.Practice.HomeWork;

import com.Practice.HomeWork.Interfaces.Frosting;
import org.springframework.stereotype.Component;

@Component("chocolateFrosting")
public class ChocolateFrosting  implements Frosting {

    @Override
    public void getFrostingType() {
        System.out.println("Chocolate Frosting");
    }
}

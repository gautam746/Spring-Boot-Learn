package com.Practice.HomeWork;

import com.Practice.HomeWork.Interfaces.Syrup;
import org.springframework.stereotype.Component;

@Component("chocolateSyrup")
public class ChocolateSyrup implements Syrup {

    @Override
    public void getSyrupType() {
        System.out.println("Chocolate Syrup");
    }
}

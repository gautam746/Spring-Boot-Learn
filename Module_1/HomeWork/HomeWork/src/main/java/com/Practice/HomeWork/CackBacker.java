package com.Practice.HomeWork;

import com.Practice.HomeWork.Interfaces.Frosting;
import com.Practice.HomeWork.Interfaces.Syrup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CackBacker {

    private final Frosting frosting;
    private final Syrup syrup;

        public CackBacker(@Qualifier("chocolateFrosting") Frosting frosting,
                          @Qualifier("chocolateSyrup") Syrup syrup){
            this.frosting = frosting;
            this.syrup = syrup;
        }

        public void backCack(){
            System.out.println("Backing cack with:");
            frosting.getFrostingType();
            syrup.getSyrupType();
            System.out.println("cack is ready");
        }
}

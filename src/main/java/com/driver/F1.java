package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
       super(name, 4, 0, 1, isManual, name, 1);
    }

    public void accelerate(int rate){
        int newSpeed = this.getCurrentSpeed() + rate;
        
        ; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            stop();
            changeGear(1);
            return;
            //Stop the car, set gear as 1
        }
        //for all other cases, change the gear accordingly
          changeGear(newSpeed <= 50 ? 1 :
           newSpeed <=100 ? 1 : 
           newSpeed <=150 ? 2 :
           newSpeed <=200 ? 4 :
           newSpeed <=250 ? 5 : 6);
       
        if(newSpeed > 0) {
            changeSpeed(newSpeed, this.getCurrentDirection());
        }
    }
}

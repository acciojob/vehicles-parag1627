package com.driver;
public class F1 extends Car {
    boolean isManual;

    public F1(String name, int currentSpeed, int currentDirection, int currentGear, boolean isManual, String gearType, int gearCount) {
        super(name, currentSpeed, currentDirection, currentGear, gearType, gearCount);
        this.isManual = isManual;
    }

    public void accelerate(int rate) {
        int newSpeed = super.currentSpeed + rate;

        if (newSpeed == 0) {
            super.stop();
            super.currentGear = 1;
        } else if (newSpeed > 0) {
            super.changeSpeed(newSpeed, super.currentDirection);
            if (newSpeed <= 50) {
                super.changeGear(1);
            } else if (newSpeed <= 100) {
                super.changeGear(2);
            } else if (newSpeed <= 150) {
                super.changeGear(3);
            } else if (newSpeed <= 200) {
                super.changeGear(4);
            } else if (newSpeed <= 250) {
                super.changeGear(5);
            } else {
                super.changeGear(6);
            }
        }
    }
}


//    boolean isManual;
//    public F1(String name, boolean isManual) {
//        super(name);
//        this.isManual = isManual;
//        //Use arbitrary values for parameters which are not mentioned
//    }
//
//    public void accelerate(int rate){
//        int newSpeed = super.currentSpeed+rate; //set the value of new speed by using currentSpeed and rate
//        /**
//         * speed 0: gear 1
//         * speed 1-50: gear 1
//         @@ -18,13 +18,23 @@ public void accelerate(int rate){
//          * speed more than 250: gear 6
//         */
//
//        if(newSpeed == 0)
//        {
//            //Stop the car, set gear as 1
//            super.stop();
//            super.currentGear = 1;
//        }
//        //for all other cases, change the gear accordingly
//
//        if(newSpeed > 0)
//        {
//            changeSpeed(newSpeed, super.currentDirection);
//            if(newSpeed<=50) super.changeGear(1);
//            else if(newSpeed<=100) super.changeGear(2);
//            else if(newSpeed<=150) super.changeGear(3);
//            else if(newSpeed<=200) super.changeGear(4);
//            else if(newSpeed<=250) super.changeGear(5);
//            else super.changeGear(6);
//        }
//    }
//}
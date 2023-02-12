package com.driver;
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    public int gears;
    public boolean isManual;
    public int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, String type, int seats)
    {
        super();

        super.name = name;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        //Hint: Car extends Vehicle
    }



    public void changeGear(int newGear)
    {
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection)
    {
        super.currentSpeed = newSpeed;
        super.currentDirection = newDirection;
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
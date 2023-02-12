package com.driver;

public class Vehicle {

    public String name;
    public int currentSpeed;
    public int currentDirection;

    public Vehicle()
    {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }



    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction)
    {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop()
    {
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }}
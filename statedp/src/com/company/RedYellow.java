package com.company;

public class RedYellow extends TrafficLightColor {

    @Override
    public TrafficLightColor change_color() {
        System.out.println("changing from red-yellow to green");
        return new Green();
    }

    @Override
    public int car_passed(int counter) {
        System.out.println("it's ok...");
        return counter;
    }
}

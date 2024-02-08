package com.company;

public class Green extends TrafficLightColor {

    @Override
    public TrafficLightColor change_color() {
        return null;
    }

    @Override
    public int car_passed(int counter) {
        System.out.println("car passed in green. increase by 1. counter = " + counter);
        return counter + 1;
    }
}

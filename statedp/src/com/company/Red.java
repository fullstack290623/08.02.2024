package com.company;

public class Red extends TrafficLightColor {

    @Override
    public TrafficLightColor change_color() {
        System.out.println("changing from red to red-yellow");
        return new RedYellow();
    }

    @Override
    public int car_passed(int counter) {
        System.out.println("Check if need to send report...");
        return counter;
    }
}

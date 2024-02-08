package com.company;

public class Main {

    final static String red_light = "RED";

    public enum Traffic_Color {
        RED,
        GREEN,
        RED_YELLOW,
        YELLOW,
        FLASHING_GREEN
    }

    public static void main(String[] args) {

        Traffic_Color color = Traffic_Color.RED;

        // we have a traffic light
        // RED, GREEN, REDYELLOW, YELLOW, FLASHINGGREEN
        // pass in red - send a report
        // pass in yellow - send a warning
        // pass in redyellow - nothing
        // pass in yellow - send a letter saying it's not recommended
        // pass in green - counter++
        // pass in flashinggreen - counter--

        TrafficLight trafficLight = new TrafficLight(new Red());
        trafficLight.car_passed();
        trafficLight.changeColor();
        trafficLight.car_passed();
        trafficLight.changeColor();
        trafficLight.car_passed();

        // Flashing-green
        // yellow
    }





}

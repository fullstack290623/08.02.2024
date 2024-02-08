package com.company;

public class TrafficLight {

    protected TrafficLightColor state;

    protected int green_counter = 0;

    public TrafficLight(TrafficLightColor state) {
        this.state = state;
    }

    public void changeColor() {
        this.state = this.state.change_color();
    }

    public void car_passed() {
        green_counter = this.state.car_passed(green_counter);
    }

    @Override
    public String toString() {
        return "TrafficLight{" +
                "state=" + state +
                '}';
    }
}

package com.company;

import lombok.ToString;

@ToString
public class Drone extends Helicopter {

    public Drone(String m_manufacturer, float m_max_speed, float m_max_altitude, String m_engine_power) {
        super(m_manufacturer, m_max_speed, m_max_altitude, m_engine_power);
    }

    public void takeOff() {
        System.out.println("taking off now!");
    }
}

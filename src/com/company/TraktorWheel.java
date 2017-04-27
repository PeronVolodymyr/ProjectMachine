package com.company;

/**
 * Created by Volodymyr on 27.04.2017.
 */
public class TraktorWheel extends Traktor {
    private int mass;
    private int countPassengers;
    private int countWheel;
    TraktorWheel(String name, int speed, int mass, int countPassengers, int countWheel)
    {
        super(name,speed);
        this.mass = mass;
        this.countPassengers = countPassengers;
        this.countWheel = countWheel;
    }
    public int getMass()
    {
        return mass;
    }
    public int getCountPassengers()
    {
        return countPassengers;
    }
    public int getCountToolMove()
    {
        return countWheel;
    }
    public String toString()
    {
        return "Information: " + "\nName - " + getName() + "\nSpeed - " + getSpeed() + "\nMass - " + getMass() + " kg." + "\nCount Passengers - " + getCountPassengers() + "\nCount Wheel - " + getCountToolMove();
    }
}

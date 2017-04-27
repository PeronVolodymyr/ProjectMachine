package com.company;

/**
 * Created by Volodymyr on 27.04.2017.
 */
public class TractorClawler extends Traktor {
    private int mass;
    private int countPassengers;
    private int countClawer;
    TractorClawler(String name, int speed, int mass, int countPassengers, int countClawer)
    {
        super(name,speed);
        this.mass = mass;
        this.countPassengers = countPassengers;
        this.countClawer = countClawer;
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
        return countClawer;
    }
    public String toString()
    {
        return "Information: " + "\nName - " + getName() + "\nSpeed - " + getSpeed() + "\nMass - " + getMass() + " kg." + "\nCount Passengers - " + getCountPassengers() + "\nCount Wheel - " + getCountToolMove();
    }
}

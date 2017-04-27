package com.company;

/**
 * Created by Volodymyr on 27.04.2017.
 */
abstract class Traktor extends Machine {
    private int speed;
    Traktor (String name, int speed)
    {
        super(name);
        this.speed = speed;
    }
    public int getSpeed()
    {
        return speed;
    }
}


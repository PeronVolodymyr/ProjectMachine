package com.company;

/**
 * Created by Volodymyr on 27.04.2017.
 */
abstract class Machine implements InterfaceRun {
    final int maxSpeed = 200;
    final int minSpeed = 0;
    final int maxCountPassengers = 5;
    final int minCountPassengers = 0;
    private String name;
    Machine (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
}

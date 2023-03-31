package org.fasttrackit.inheritance;

public class Bike {
    private static int maxPressure = 10;
    private int tyrePressure;
    private int speed;

    public Bike(int tyrePressure){
        this.tyrePressure = tyrePressure;
    }

    public void increaseSpeed(int amount){

        this.speed += amount;
    }

    public void stop() {
        this.speed = 0;
    }

    public void flatTyre() {
        this.tyrePressure = 0;
    }

    public void inflateTyre(int amount) {
        tyrePressure += amount;
        if (tyrePressure > maxPressure){
            flatTyre();
        }
    }

    public static int getMaxPressure() {
        return maxPressure;
    }

    public int getTyrePressure() {
        return tyrePressure;
    }

    public int getSpeed() {
        return speed;
    }
}

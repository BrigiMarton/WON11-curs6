package org.fasttrackit.inheritance;

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike(3);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(6);
        System.out.println(bike.getTyrePressure());
        bike.inflateTyre(2);
        System.out.println(bike.getTyrePressure());

        MountainBike mountainBike = new MountainBike();
        System.out.println(mountainBike.getTyrePressure());
    }
}

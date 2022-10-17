package edu.najah.I;


import edu.najah.I.intrf.Swimming;

public class Penguin implements Swimming {
    String currentLocation;
    int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void swim() {

        this.currentLocation = "in the water";
    }
}

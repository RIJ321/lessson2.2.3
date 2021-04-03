package com.company;

public class Saturn extends Planets {

    private int distance;

    public Saturn(Color color, Size size, int distance) {
        super(color, size);
        this.distance = distance;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("" +
                "Distance: " + distance + "\n");
    }
}

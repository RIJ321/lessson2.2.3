package com.company;

public class Earth extends Planets  implements Printable{

    private int remainingTime;

    public Earth(Color color, Size size, int remainingTime) {
        super(color, size);
        this.remainingTime = remainingTime;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Remaining time: "+remainingTime+" years\n");
    }
}

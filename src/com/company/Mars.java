package com.company;

public class Mars extends Planets implements Printable {

    private String isHaveLife;

    public Mars(Color color, Size size, String isHaveLife) {
        super(color, size);
        this.isHaveLife = isHaveLife;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("" +
                "Is have life: "+isHaveLife+"\n");
    }
}

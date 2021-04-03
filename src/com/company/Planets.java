package com.company;

public class Planets implements Printable {

    private Color color;
    private  Size size;

    public Planets(Color color, Size size){
        this.color=color;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("" +
                "Color: " + color+"\n" +
                "Size: "+size);
    }
}

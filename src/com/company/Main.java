package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Mars");
        createObject("Saturn");


    }

    protected static Planets createObject(String className) {
        switch (className) {
            case "Mars":
                Mars mars = new Mars(Color.RED, Size.SMALL, "Maybe");
                mars.print();
                return mars;
            case "Saturn":
                Saturn saturn = new Saturn(Color.BROWN, Size.BIGGEST, 5000);
                saturn.print();
                return saturn;
            case "Earth":
                Earth earth = new Earth(Color.MULTI, Size.MIDDLE, 80);
                earth.print();
                return earth;
        }
        return null;
    }
}

/*
2)  (Дэдлайн 3.04.2021 23:59) :
a)  Доделать все пункты практического задания из презентации.
b)  Создать 2х уровневую иерархию из 4х классов (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
c)  Создать Интерфейс Printable с методом void print();
d)  Реализовать интерфейс Printable классами 2й, 3й и 4й,
переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.

e)  В классе Main создать возвращаемый метод createObject(String className),
 который умеет создавать объекты класса 2й, 3й и 4й и после создания
 и задания свойств объекту метод возвращает ссылку на объект (пульт).
 Можно использовать switch для того чтоб определить какого типа нужно создать экземпляр объекта.
 Например если в параметре передается “2й” метод должен создать объект именно этого типа.

f)  В главном классе Main создать 3 различных объекта классов 2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();
 */

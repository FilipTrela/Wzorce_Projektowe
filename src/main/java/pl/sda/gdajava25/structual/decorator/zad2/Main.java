package pl.sda.gdajava25.structual.decorator.zad2;

import pl.sda.gdajava25.structual.decorator.zad2.pizza.CustomPizza;
import pl.sda.gdajava25.structual.decorator.zad2.pizza.IPizza;
import pl.sda.gdajava25.structual.decorator.zad2.pizza.Pizzeria;

public class Main {
    public static void main(String[] args) {
        IPizza pizza = Pizzeria.createCapricciosaPizza();

        pizza = new CustomPizza(pizza, "Ser", "mieso", "kielbasa");
        pizza = new CustomPizza(pizza, "owca");


    }
}

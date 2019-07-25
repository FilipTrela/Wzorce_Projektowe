package pl.sda.gdajava25.structual.decorator.zad2.pizza;

import java.util.Arrays;

public abstract class Pizzeria {

    public static IPizza createMargharritaPizza() {
        return new SimplePizza();
    }

    public static IPizza createPineapplePizza() {
        CustomPizza pineapple = new CustomPizza();
        pineapple.addIngriedent("Ananas", "Szynka");
        return pineapple;
    }

    public static IPizza createPepperoniPizza() {
        CustomPizza pepperoni = new CustomPizza();
        pepperoni.addIngriedent("Jalapeno", "Salami");
        return pepperoni;
    }

    public static IPizza createQuattroFormaggi() {
        CustomPizza fromaggi = new CustomPizza();
        fromaggi.addIngriedent("Feta", "Gouda", "Parmezan");
        return fromaggi;
    }

    public static IPizza createCapricciosaPizza() {
        CustomPizza capricciosa = new CustomPizza();
        capricciosa.addIngriedent("Pieczarki", "Szynka");
        return capricciosa;
    }

    public static IPizza createCustomPizza(String... składnik){
        CustomPizza custom = new CustomPizza();
        for(String s: składnik){
            custom.addIngriedent(s);
        }
        return custom;

    }
}

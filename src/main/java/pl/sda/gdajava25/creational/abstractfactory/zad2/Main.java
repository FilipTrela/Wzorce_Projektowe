package pl.sda.gdajava25.creational.abstractfactory.zad2;

import pl.sda.gdajava25.creational.abstractfactory.zad2.bike.BikeFactory;
import pl.sda.gdajava25.creational.abstractfactory.zad2.bike.IBike;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IBike> bikeList = new ArrayList<>(Arrays.asList(
                BikeFactory.creatBicycleMerida(),
                BikeFactory.creatBicycleKross(),
                BikeFactory.creatBicycleFelt(),
                BikeFactory.creatTandemGoetze(),
                BikeFactory.creatTandemIniana()
        ));
        bikeList.forEach(System.out::println);
    }
}

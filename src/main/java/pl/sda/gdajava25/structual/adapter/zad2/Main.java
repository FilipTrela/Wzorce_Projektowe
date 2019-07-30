package pl.sda.gdajava25.structual.adapter.zad2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PeopleRegistry peopleRegistry = new PeopleRegistry();
        Map<Integer, IHuman> iHumanMap = peopleRegistry.returnIHumanMap();
        iHumanMap.entrySet().forEach(System.out::println);
    }
}

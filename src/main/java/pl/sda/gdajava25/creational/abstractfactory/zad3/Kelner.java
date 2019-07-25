package pl.sda.gdajava25.creational.abstractfactory.zad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kelner {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final List<Pizza> MENU = new ArrayList<>();

    public Kelner() {
        MENU.add(PizzaFactory.creatPizzaMargherita());
        MENU.add(PizzaFactory.creatPizzaCapricciosa());
        MENU.add(PizzaFactory.creatPizzaSalami());
        MENU.add(PizzaFactory.creatPizzaSalamiPiccante());
        MENU.add(PizzaFactory.creatPizzaHavaiana());
        MENU.add(PizzaFactory.creatPizzaDiParma());
    }

    public void przywitaj() {
        System.out.println("Witam w Pizzeri LaPompa");
    }

    public String coChcePanZrobic() {
        System.out.println("Chce pan menu? Czy chce pan wyjść?");
        String komenda;
        do {
            komenda = SCANNER.nextLine().toLowerCase();
            if (komenda.contains("menu")) {
                return "menu";
            } else if (komenda.contains("wyjsc") || komenda.contains("wyjść")) {
                return "exit";
            } else {
                System.out.println("Nie zrozumiałem. Jeszcze raz?");
                komenda = null;
            }

        } while (komenda == null);

        return komenda;
    }


    public void podajMenu() {
        MENU.forEach(System.out::println);
    }

    public void zapytajOZamówienie() throws InterruptedException {
        String odpowiedz;
        do {
            odpowiedz = zapytajCzyGotowy();
            if (odpowiedz.contains("nie")) ;
            Thread.sleep(3000);
        } while (!odpowiedz.contains("tak"));
    }

    public Pizza złóżZamówienie() {
        return ustalCoZamówił(wysłuchajZamówienia());
    }

    public void podajDoStołu(Pizza pizza) {
        System.out.println("Prosze o to pana pizza!");
        System.out.println(pizza.toString());
        porzegnaj();
    }

    private String zapytajCzyGotowy() {
        System.out.println("Czy jest pan gotów złożyć zamówienie?");
        return SCANNER.nextLine().toLowerCase();
    }

    private String wysłuchajZamówienia() {
        System.out.println("Co chciałby pan zamówić?");
        return SCANNER.nextLine().toLowerCase();
    }

    private Pizza ustalCoZamówił(String zamówienie) {
        if (zamówienie.contains("salami picante") || zamówienie.contains("salami piccante"))
            return PizzaFactory.creatPizzaSalamiPiccante();
        else if (zamówienie.contains("salami"))
            return PizzaFactory.creatPizzaSalami();
        else if (zamówienie.contains("havaiana") || zamówienie.contains("hawajska"))
            return PizzaFactory.creatPizzaHavaiana();
        else if (zamówienie.contains("parma"))
            return PizzaFactory.creatPizzaDiParma();
        else if (zamówienie.contains("capricciosa") || zamówienie.contains("capriciosa"))
            return PizzaFactory.creatPizzaCapricciosa();
        return new Pizza.PizzaBuilder().nazwa("Suchy placek").build();
    }

    public void porzegnaj() {
        System.out.println("Do widzienia :)");
    }
}

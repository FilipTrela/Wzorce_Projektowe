package pl.sda.gdajava25.creational.abstractfactory.zad3;

public class Main {
    public static void main(String[] args) {
        Kelner kelner = new Kelner();
        Pizza pizza = null;

        kelner.przywitaj();
        String co = kelner.coChcePanZrobic();
        if (co.equalsIgnoreCase("menu")) {
            kelner.podajMenu();
            try {
                Thread.sleep(4000);
                kelner.zapytajOZamówienie();
                pizza = kelner.złóżZamówienie();
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kelner.podajDoStołu(pizza);
        } else {
            kelner.porzegnaj();
        }
    }
}
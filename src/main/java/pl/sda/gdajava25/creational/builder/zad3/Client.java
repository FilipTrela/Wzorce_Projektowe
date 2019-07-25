package pl.sda.gdajava25.creational.builder.zad3;

import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode
public class Client {
    private String name;
    private List<Mail> listaWiadomosci = new ArrayList<>();

    public void readMail(Mail m) {
        listaWiadomosci.add(m);
        System.out.println("Klient " + name + " otrzymał maila.");
    }

    public Client(String name) {
        this.name = name;
    }
}

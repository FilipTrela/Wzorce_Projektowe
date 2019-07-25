package pl.sda.gdajava25.creational.singleton.zad2;


import pl.sda.gdajava25.creational.singleton.zad2.SingeltonLazy.GameLazy;
import pl.sda.gdajava25.creational.singleton.zad2.SingletonEager.GameEager;
import pl.sda.gdajava25.creational.singleton.zad2.SingletonEnum.GameEnum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SettingsReader reader = new SettingsReader();
        Scanner scanner = new Scanner(System.in);
        String typ = askWhatType(scanner);
        starGame(typ, reader, scanner);

    }

    private static void starGame(String typ, SettingsReader reader, Scanner scanner) {
        if (typ.equalsIgnoreCase("enum"))
            whenPlayerChooseEnum(reader, scanner);
        if (typ.equalsIgnoreCase("eager"))
            whenPlayerChooseEager(reader, scanner);
        if (typ.equalsIgnoreCase("lazy"))
            whenPlayerChooseLazy(reader, scanner);
    }

    private static void whenPlayerChooseEager(SettingsReader reader, Scanner scanner) {
        System.out.println("Gra ładuje ustawienia sposobem z eager");
        GameEager gameEager = new GameEager();

        reader.readSettingsFromFile();

        do {
            gameEager.nextRound();

            int result = Integer.parseInt(scanner.nextLine());
            if (gameEager.validate(result)) {
                System.out.println("Poprawna odpowiedź");
            } else {
                System.out.println("Zła odpowiedź");
            }
        } while (!gameEager.hasEnded());

        System.out.println("Gratulacej zdobyłeś " + gameEager.getScore() + " punktów na " + gameEager.getGameCounter() + " możliwych.");
    }

    private static void whenPlayerChooseLazy(SettingsReader reader, Scanner scanner) {
        System.out.println("Gra ładuje ustawienia sposobem lazy");
        GameLazy gameLazy = new GameLazy();

        reader.readSettingsFromFile();

        do {
            gameLazy.nextRound();

            int result = Integer.parseInt(scanner.nextLine());
            if (gameLazy.validate(result)) {
                System.out.println("Poprawna odpowiedź");
            } else {
                System.out.println("Zła odpowiedź");
            }
        } while (!gameLazy.hasEnded());

        System.out.println("Gratulacej zdobyłeś " + gameLazy.getScore() + " punktów na " + gameLazy.getGameCounter() + " możliwych.");
    }


    private static String askWhatType(Scanner scanner) {
        System.out.println("Podaj czy jakis sposób Singeltona [Enum,Eager,Lazy]");
        String typ;
        do {
            typ = scanner.nextLine().toLowerCase();
            if (typ.equalsIgnoreCase("enum")) {
                typ = "enum";
            } else if (typ.equalsIgnoreCase("eager")) {
                typ = "eager";
            } else if (typ.equalsIgnoreCase("lazy"))
                typ = "lazy";
            else {
                typ = null;
            }
        } while (typ == null);
        return typ;
    }

    private static void whenPlayerChooseEnum(SettingsReader reader, Scanner scanner) {
        GameEnum gameEnum = new GameEnum();
        System.out.println("Gra ładuje ustawienia sposobem z enumem");
        reader.readSettingsFromFile();

        do {
            gameEnum.nextRound();

            int result = Integer.parseInt(scanner.nextLine());
            if (gameEnum.validate(result)) {
                System.out.println("Poprawna odpowiedź");
            } else {
                System.out.println("Zła odpowiedź");
            }
        } while (!gameEnum.hasEnded());

        System.out.println("Gratulacej zdobyłeś " + gameEnum.getScore() + " punktów na " + gameEnum.getGameCounter() + " możliych.");
    }
}
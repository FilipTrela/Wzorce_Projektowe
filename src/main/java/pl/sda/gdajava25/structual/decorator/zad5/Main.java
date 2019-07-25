package pl.sda.gdajava25.structual.decorator.zad5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witam w sklepie z choinkami !");
        int wysokosc = getWysokoscChoinki(scanner);

        SimpleChristmasTree simpleChristmasTree = getSimpleChristmasTree(wysokosc);
        if (czyDekorować(scanner)) {
            DecoratedChristmasTree(simpleChristmasTree);
            System.out.println();
            pozegnaj();
        } else {
            pozegnaj();
        }

    }

    private static void DecoratedChristmasTree(SimpleChristmasTree simpleChristmasTree) {
        DecoratedChristmasTree decoratedChristmasTree = new DecoratedChristmasTree(simpleChristmasTree);
        decoratedChristmasTree.printTree();
    }


    private static boolean czyDekorować(Scanner scanner) {
        System.out.println("Czy udekorować? [y/n]");
        String czyDekorować;
        do {
            czyDekorować = scanner.nextLine();
            if (czyDekorować.equalsIgnoreCase("y")) {
                return true;
            } else if (czyDekorować.equalsIgnoreCase("n")) {
                return false;
            } else {
                czyDekorować = null;
            }
        } while (czyDekorować == null);
        return false;
    }

    private static SimpleChristmasTree getSimpleChristmasTree(int wysokosc) {
        SimpleChristmasTree simpleChristmasTree = new SimpleChristmasTree(wysokosc);
        simpleChristmasTree.printTree();
        return simpleChristmasTree;
    }

    private static int getWysokoscChoinki(Scanner scanner) {
        System.out.println("Podaj wysokość choinki");
        int wysokosc = 0;
        try {
            wysokosc = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.getMessage();
            e.printStackTrace();
        }
        return wysokosc;
    }

    private static void pozegnaj() {
        System.out.println("Do widzienia :)");
    }

}

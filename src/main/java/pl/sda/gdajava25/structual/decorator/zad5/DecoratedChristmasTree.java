package pl.sda.gdajava25.structual.decorator.zad5;

import java.util.Random;

public class DecoratedChristmasTree {
    private SimpleChristmasTree choinka;

    public DecoratedChristmasTree(SimpleChristmasTree simpleChristmasTree) {
        this.choinka = simpleChristmasTree;
    }

    public void printTree() {
        for (int i = 0; i < choinka.getChoinka().length; i++) {
            for (int j = 0; j < choinka.getChoinka()[i].length; j++) {
                if (i == 0 && j == choinka.getChoinka()[0].length / 2) {
                    System.out.print('X');
                } else if (choinka.getChoinka()[i][j] == '*' && putO()) {
                    System.out.print("O");
                } else
                    System.out.print(choinka.getChoinka()[i][j]);
            }
            System.out.println();
        }
    }

    private boolean putO() {
        Random random = new Random();
        int liczba = random.nextInt(100) + 1;
        return liczba < 14;
    }
}

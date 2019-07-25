package pl.sda.gdajava25.structual.decorator.zad5;

import lombok.Data;

@Data
public class SimpleChristmasTree {
    private int wysokość;
    private int szerokość;
    private char[][] choinka;


    public SimpleChristmasTree(int wysokość) {
        this.wysokość = wysokość;
        this.szerokość = wysokość*2;
        this.choinka = new char[wysokość][szerokość];
        crateTree();
    }


    public void printTree() {
        for (int i = 0; i < choinka.length; i++) {
            for (int j = 0; j < choinka[i].length; j++) {
                System.out.print(choinka[i][j]);
            }
            System.out.println();
        }
    }

    private void crateTree() {
        for (int i = 0; i < wysokość; i++) {
            for (int j = 0; j < szerokość; j++) {
                if (j < (wysokość - i) || j > (wysokość + i)) {
                    choinka[i][j] = ' ';
                } else
                    choinka[i][j] = '*';

            }
        }
    }

}


package pl.sda.gdajava25.creational.builder.zad1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameCharacter> gameCharacters = new ArrayList<GameCharacter>();
        GameCharacter.Builder builder = new GameCharacter.Builder();
        gameCharacters.add(builder.setName("Janek").setHealth(100).setMana(40).setNumberOfPoints(112).createGameCharacter());
        gameCharacters.add(builder.setName("Wacek").setHealth(100).setMana(100).setNumberOfPoints(102).createGameCharacter());
        gameCharacters.add(builder.setName("Placek").setHealth(100).setMana(40).setNumberOfPoints(112).createGameCharacter());
        gameCharacters.add(builder.setName("Tusk").setHealth(160).setMana(10).setNumberOfPoints(12).createGameCharacter());
        gameCharacters.add(builder.setName("Miodzio").setHealth(60).setMana(140).setNumberOfPoints(1044).createGameCharacter());
        gameCharacters.add(builder.setName("WasIsDas").setHealth(40).setMana(20).setNumberOfPoints(124).createGameCharacter());

        for (GameCharacter g : gameCharacters) {
            System.out.println(g.toString());
        }

    }
}

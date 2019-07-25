package pl.sda.gdajava25.creational.singleton.zad2.SingeltonLazy;

import lombok.Data;

@Data
public class GameLazy {
    private int gameCounter = 0;
    private int score = 0;

    private RoundLazy roundLazy;

    public boolean validate(int userResult) {
        boolean result = roundLazy.validate(userResult);

        if (result) {
            score++;
        }
        return result;
    }

    public void nextRound() {
        gameCounter++;

        roundLazy = new RoundLazy();
        System.out.println(roundLazy);
    }

    public boolean hasEnded() {
        return gameCounter >= MySettingsLazy.getInstance().getNumberOfRounds();
    }


}

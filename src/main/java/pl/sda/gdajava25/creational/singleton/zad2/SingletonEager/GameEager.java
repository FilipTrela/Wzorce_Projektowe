package pl.sda.gdajava25.creational.singleton.zad2.SingletonEager;

import lombok.Data;
import pl.sda.gdajava25.creational.singleton.zad2.SingletonEnum.RoundEager;

@Data
public class GameEager {
    private int gameCounter = 0;
    private int score = 0;

    private RoundEager roundEager;

    public boolean validate(int userResult) {
        boolean result = roundEager.validate(userResult);

        if (result) {
            score++;
        }
        return result;
    }

    public void nextRound() {
        gameCounter++;

        roundEager = new RoundEager();
        System.out.println(roundEager);
    }

    public boolean hasEnded() {
        return gameCounter >= MySettingsEager.getInstance().getNumberOfRounds();
    }


}

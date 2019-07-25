package pl.sda.gdajava25.creational.singleton.zad2.SingletonEnum;

import lombok.Data;

@Data
public class GameEnum {
    private int gameCounter = 0;
    private int score = 0;

    private RoundEager roundEnum;

    public boolean validate(int userResult) {
        boolean result = roundEnum.validate(userResult);

        if (result) {
            score++;
        }
        return result;
    }

    public void nextRound() {
        gameCounter++;

        roundEnum = new RoundEager();
        System.out.println(roundEnum);
    }

    public boolean hasEnded() {
        return gameCounter >= MySettingsEnum.INSTANCE.getNumberOfRounds();
    }


}

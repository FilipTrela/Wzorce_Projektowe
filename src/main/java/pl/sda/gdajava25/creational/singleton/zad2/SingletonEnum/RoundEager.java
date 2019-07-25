package pl.sda.gdajava25.creational.singleton.zad2.SingletonEnum;

import java.util.Random;

public class RoundEager {
    private int no1, no2;
    private char sign;

    public RoundEager() {
        no1 = new Random().nextInt(MySettingsEnum.INSTANCE.getRange1());
        no2 = new Random().nextInt(MySettingsEnum.INSTANCE.getRange2());
        int singnsSize = MySettingsEnum.INSTANCE.getSigns().length();
        sign = MySettingsEnum.INSTANCE.getSigns().charAt(new Random().nextInt(singnsSize));
    }

    public boolean validate(int userResult) {
        if (sign == '+') {
            return (no1 + no2) == userResult;
        } else if (sign == '-') {
            return (no1 - no2) == userResult;
        } else if (sign == '*') {
            return (no1 * no2) == userResult;
        } else if (sign == '/') {
            return (no1 / no2) == userResult;
        }
        return false;
    }

    public int getNo1() {
        return no1;
    }

    public void setNo1(int no1) {
        this.no1 = no1;
    }

    public int getNo2() {
        return no2;
    }

    public void setNo2(int no2) {
        this.no2 = no2;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    @Override
    public String toString() {
        return "Ile to jest " +
                no1 + " " + sign + " " + no2 + " ?";
    }
}

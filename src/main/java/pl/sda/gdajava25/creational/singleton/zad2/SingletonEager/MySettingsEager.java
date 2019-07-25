package pl.sda.gdajava25.creational.singleton.zad2.SingletonEager;

import lombok.Data;

@Data
public class MySettingsEager {
    private static final MySettingsEager INSTANCE = new MySettingsEager();
    private int numberOfRounds;
    private int range1;
    private int range2;
    private String signs;

    private MySettingsEager() {
    }

    public static MySettingsEager getInstance() {
        return INSTANCE;
    }

}

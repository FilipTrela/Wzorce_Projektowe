package pl.sda.gdajava25.creational.singleton.zad2.SingeltonLazy;

import lombok.Data;

@Data
public class MySettingsLazy {
    private static MySettingsLazy INSTANCE;
    private int numberOfRounds;
    private int range1;
    private int range2;
    private String signs;

    private MySettingsLazy() {
    }

    public static MySettingsLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (MySettingsLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new MySettingsLazy();
                }
            }
        }
        return INSTANCE;
    }
}


package pl.sda.gdajava25.creational.singleton.zad2;

import pl.sda.gdajava25.creational.singleton.zad2.SingletonEager.MySettingsEager;
import pl.sda.gdajava25.creational.singleton.zad2.SingletonEnum.MySettingsEnum;
import pl.sda.gdajava25.creational.singleton.zad2.SingeltonLazy.MySettingsLazy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SettingsReader {
    public void readSettingsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("config.txt"))) {

            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            String line4 = reader.readLine();

            String value1 = line1.split("=")[1];
            String value2 = line2.split("=")[1];
            String value3 = line3.split("=")[1];
            String value4 = line4.split("=")[1];

            int range1 = Integer.parseInt(value1);
            int range2 = Integer.parseInt(value2);
            int rounds = Integer.parseInt(value4);

            MySettingsEnum.INSTANCE.setRange1(range1);
            MySettingsEnum.INSTANCE.setRange2(range2);
            MySettingsEnum.INSTANCE.setNumberOfRounds(rounds);
            MySettingsEnum.INSTANCE.setSigns(value3);
            MySettingsEager.getInstance().setRange1(range1);
            MySettingsEager.getInstance().setRange2(range2);
            MySettingsEager.getInstance().setNumberOfRounds(rounds);
            MySettingsEager.getInstance().setSigns(value3);
            MySettingsLazy.getInstance().setRange1(range1);
            MySettingsLazy.getInstance().setRange2(range2);
            MySettingsLazy.getInstance().setNumberOfRounds(rounds);
            MySettingsLazy.getInstance().setSigns(value3);


        } catch (IOException ioe) {
            System.err.println("brak pliku");
        }
    }
}

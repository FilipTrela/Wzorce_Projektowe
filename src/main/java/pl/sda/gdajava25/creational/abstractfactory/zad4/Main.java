package pl.sda.gdajava25.creational.abstractfactory.zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Telefon> telefons = new ArrayList<>(Arrays.asList(
                FabrykaTelefonówSamsung.createSamsungGalaxyS10(),
                FabrykaTelefonówSamsung.createSamsungGalaxyS10plus(),
                FabrykaTelefonówApple.createAppleIphoneX(),
                FabrykaTelefonówApple.createAppleIphoneXMax()
        ));

        telefons.forEach(System.out::println);
    }
}

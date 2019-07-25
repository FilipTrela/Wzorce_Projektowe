package pl.sda.gdajava25.creational.abstractfactory.zad1;

import pl.sda.gdajava25.creational.abstractfactory.zad1.pc.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractPC> abstractPCS = new ArrayList<>(Arrays.asList(
                AppleMac.createMacProRetina15(),AppleMac.createMacBook15(),
                HpPC.createHP123(),HpPC.createHP8080(),
                AsusPC.createAsusH21(),AsusPC.createAsusH111(),
                SamsungPC.createSamsungN321(),SamsungPC.createSamsungN765()
        ));
        abstractPCS.forEach(System.out::println);

    }
}

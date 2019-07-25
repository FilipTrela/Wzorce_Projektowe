package pl.sda.gdajava25.creational.abstractfactory.zad4;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Telefon {
    private String producent;
    private String model;
    private double szerokośćEkranu;
    private double wysokośćEkranu;
    private int mocProcesora;
    private int iloscRdzeni;
    private int iloscSlotówNaKarteSim;

}

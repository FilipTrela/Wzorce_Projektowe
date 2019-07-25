package pl.sda.gdajava25.creational.abstractfactory.zad2.bike;

public interface IBike {
    void drive();

    int getIloscMiejsc();

    int getIloscPrzerzutek();

    TypRoweru getTypRoweru();

    String toString();
}

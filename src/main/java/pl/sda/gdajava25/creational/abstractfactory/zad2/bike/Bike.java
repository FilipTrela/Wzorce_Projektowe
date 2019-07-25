package pl.sda.gdajava25.creational.abstractfactory.zad2.bike;

import lombok.AllArgsConstructor;
@AllArgsConstructor
class Bike implements IBike {
    private String marka;
    private int iloscMiejsc;
    private int iloscPrzerzutek;
    private TypRoweru typRoweru;

    @Override
    public void drive() {

    }

    @Override
    public int getIloscMiejsc() {
        return 0;
    }

    @Override
    public int getIloscPrzerzutek() {
        return 0;
    }

    @Override
    public TypRoweru getTypRoweru() {
        return null;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "marka='" + marka + '\'' +
                ", iloscMiejsc=" + iloscMiejsc +
                ", iloscPrzerzutek=" + iloscPrzerzutek +
                ", typRoweru=" + typRoweru +
                '}';
    }
}

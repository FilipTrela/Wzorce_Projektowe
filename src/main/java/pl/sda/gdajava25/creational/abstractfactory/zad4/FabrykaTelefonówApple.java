package pl.sda.gdajava25.creational.abstractfactory.zad4;

public class FabrykaTelefonówApple {
    public static Telefon createAppleIphoneX() {
        return Telefon.builder()
                .iloscRdzeni(3)
                .iloscSlotówNaKarteSim(1)
                .mocProcesora(1212)
                .model("Iphone X")
                .producent("Apple")
                .szerokośćEkranu(8.1)
                .wysokośćEkranu(14.2)
                .build();
    }

    public static Telefon createAppleIphoneXMax() {
        return Telefon.builder()
                .iloscRdzeni(4)
                .iloscSlotówNaKarteSim(1)
                .mocProcesora(1342)
                .model("Iphone X Max")
                .producent("Apple")
                .szerokośćEkranu(9.1)
                .wysokośćEkranu(15.7)
                .build();
    }
}

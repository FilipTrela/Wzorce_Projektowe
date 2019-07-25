package pl.sda.gdajava25.creational.abstractfactory.zad4;

public class FabrykaTelefonówSamsung {

    public static Telefon createSamsungGalaxyS10() {
        return Telefon.builder()
                .iloscRdzeni(4)
                .iloscSlotówNaKarteSim(2)
                .mocProcesora(1000)
                .model("Galaxy S10")
                .producent("Samsung")
                .szerokośćEkranu(8.6)
                .wysokośćEkranu(14.5)
                .build();
    }

    public static Telefon createSamsungGalaxyS10plus() {
        return Telefon.builder()
                .iloscRdzeni(4)
                .iloscSlotówNaKarteSim(2)
                .mocProcesora(1000)
                .model("Galaxy S10+")
                .producent("Samsung")
                .szerokośćEkranu(9.6)
                .wysokośćEkranu(16.5)
                .build();
    }
}

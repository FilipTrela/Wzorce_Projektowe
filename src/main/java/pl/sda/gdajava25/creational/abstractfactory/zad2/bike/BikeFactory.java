package pl.sda.gdajava25.creational.abstractfactory.zad2.bike;

public abstract class BikeFactory {

    public static IBike creatBicycleKross() {
        return new Bike("Kross", 1, 5, TypRoweru.BICYCLE);
    }

    public static IBike creatBicycleMerida() {
        return new Bike("Merida", 1, 6, TypRoweru.BICYCLE);
    }

    public static IBike creatBicycleFelt() {
        return new Bike("Felt", 1, 6, TypRoweru.BICYCLE);
    }

    public static IBike creatTandemIniana() {
        return new Bike("Iniana", 2, 3, TypRoweru.TANDEM);
    }

    public static IBike creatTandemGoetze() {
        return new Bike("Goetze", 2, 1, TypRoweru.TANDEM);
    }
}

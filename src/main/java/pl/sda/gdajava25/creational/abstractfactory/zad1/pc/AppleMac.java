package pl.sda.gdajava25.creational.abstractfactory.zad1.pc;

public final class AppleMac extends AbstractPC {

    private AppleMac(String name, ComputerBrand computerBrand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverclocked);
    }

    public static AbstractPC createMacProRetina15() {
        return new AppleMac("MacProRetina", ComputerBrand.APPLE, 1900, 1244, false);
    }

    public static AbstractPC createMacBook15() {
        return new AppleMac("MacBookRetina", ComputerBrand.APPLE, 1741, 912, false);
    }
}

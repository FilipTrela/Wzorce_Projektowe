package pl.sda.gdajava25.creational.abstractfactory.zad1.pc;

public final class SamsungPC extends AbstractPC {
    private SamsungPC(String name, ComputerBrand computerBrand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverclocked);
    }
    public static AbstractPC createSamsungN321() {
        return new SamsungPC("SamsungN321", ComputerBrand.SAMSUNG, 123, 123, false);
    }

    public static AbstractPC createSamsungN765() {
        return new SamsungPC("SamsungN765", ComputerBrand.SAMSUNG, 1120, 1123, true);
    }
}

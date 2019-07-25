package pl.sda.gdajava25.creational.abstractfactory.zad1.pc;

public final class HpPC extends AbstractPC {
    private HpPC(String name, ComputerBrand computerBrand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverclocked);
    }

    public static AbstractPC createHP123() {
        return new HpPC("HP123", ComputerBrand.HP, 345, 342, false);
    }

    public static AbstractPC createHP8080() {
        return new HpPC("HP8080", ComputerBrand.HP, 1345, 1132, true);
    }
}

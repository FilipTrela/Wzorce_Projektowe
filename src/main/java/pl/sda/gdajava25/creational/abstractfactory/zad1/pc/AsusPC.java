package pl.sda.gdajava25.creational.abstractfactory.zad1.pc;

public final class AsusPC extends AbstractPC {
    private AsusPC(String name, ComputerBrand computerBrand, int cpuPower, int gpuPower, boolean isOverclocked) {
        super(name, computerBrand, cpuPower, gpuPower, isOverclocked);
    }

    public static AbstractPC createAsusH21() {
        return new AsusPC("AsusH21", ComputerBrand.ASUS, 323, 423, false);
    }

    public static AbstractPC createAsusH111() {
        return new AsusPC("AsusH111", ComputerBrand.ASUS, 1323, 1423, true);
    }
}

package pl.sda.gdajava25.creational.abstractfactory.zad1.pc;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public abstract class AbstractPC {
    private String name;
    private ComputerBrand computerBrand;
    private int cpuPower;
    private int gpuPower;
    private boolean isOverclocked;

}

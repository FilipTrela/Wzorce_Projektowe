package pl.sda.gdajava25.structual.adapter.zad1.adapters;

import pl.sda.gdajava25.structual.adapter.zad1.KitchenDevice;
import pl.sda.gdajava25.structual.adapter.zad1.devices.CoffeMachine;

public class CoffeMachineInheritedAdapter extends CoffeMachine implements KitchenDevice {
    public void turnDeviceOn() {
        super.on();
    }
}

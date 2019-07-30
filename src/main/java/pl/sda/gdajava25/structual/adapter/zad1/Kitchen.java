package pl.sda.gdajava25.structual.adapter.zad1;


import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private List<KitchenDevice> deviceList;

    public Kitchen() {
        this.deviceList = new ArrayList<KitchenDevice>();
//        this.deviceList.add(new CoffeMachine()); ??
    }

    public void turnEverythingOn(){
        for (KitchenDevice device : deviceList) {
            device.turnDeviceOn();
        }
    }

    // TODO: turn off
}
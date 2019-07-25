package pl.sda.gdajava25.creational.abstractfactory.zad3;

import lombok.Builder;

import java.util.List;

@Builder
public class Pizza {
    private String nazwa;
    private List<String> skladniki;

    @Override
    public String toString() {
        return nazwa + '\n' +
                skladniki;
    }
}

package pl.sda.gdajava25.structual.decorator.zad2.pizza;


import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public final class SimplePizza implements IPizza {
    private List<String> ingredients = new ArrayList<>(Arrays.asList("ser", "sos"));
    private double price;


}

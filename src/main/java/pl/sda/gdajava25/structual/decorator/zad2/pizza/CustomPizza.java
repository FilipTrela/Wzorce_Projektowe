package pl.sda.gdajava25.structual.decorator.zad2.pizza;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomPizza implements IPizza {
    private IPizza pizza;
    private List<String> ingriedients = new ArrayList<>();

    public CustomPizza() {
        this.pizza = new SimplePizza();
    }

    public CustomPizza(IPizza pizza, String... ingredients) {
        this.pizza = pizza;
        this.ingriedients.addAll(Arrays.asList(ingredients));
    }

    @Override
    public List<String> getIngredients() {
        List<String> ing = ingriedients;
        ing.addAll(pizza.getIngredients());
        return ing;
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + (ingriedients.size() * 2.5);
    }

    public void addIngriedent(String... ingriedient) {
        ingriedients.addAll(Arrays.asList(ingriedient));
    }
}

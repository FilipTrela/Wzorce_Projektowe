package pl.sda.gdajava25.creational.abstractfactory.zad3;

import java.util.Arrays;

public abstract class PizzaFactory {

    public static Pizza creatPizzaHavaiana(){
        return Pizza.builder().skladniki(Arrays.asList("sos pomidorowy","mozarella","ananas","szynka")).nazwa("Pizza Havaiana").build();
    }
    public static Pizza creatPizzaMargherita(){
        return Pizza.builder().nazwa("Pizza Margherita").skladniki(Arrays.asList("sos pomidorowy","mozarella","bazylia")).build();
    }
    public static Pizza creatPizzaDiParma(){
        return Pizza.builder().nazwa("Pizza Di Parma").skladniki(Arrays.asList("sos pomidorowy","mozarella","szynka Parma","grand padano")).build();
    }
    public static Pizza creatPizzaSalami(){
        return Pizza.builder().nazwa("Pizza Salami").skladniki(Arrays.asList("sos pomidorowy","mozarella","salami")).build();
    }
    public static Pizza creatPizzaCapricciosa(){
        return Pizza.builder().nazwa("Pizza Capricciosa").skladniki(Arrays.asList("sos pomidorowy","ser","pieczarki","szynka")).build();
    }
    public static Pizza creatPizzaSalamiPiccante(){
        return Pizza.builder().nazwa("Pizza Salami Piccante").skladniki(Arrays.asList("sos pomidorowy","mozarella","salami","jalapeno")).build();
    }


}

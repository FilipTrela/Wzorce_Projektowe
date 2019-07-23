package pl.sda.gdajava25.creational.builder.zad2;

public class Main {
    public static void main(String[] args) {
        Stamp.Builder builder = new Stamp.Builder();
        Stamp stamp = builder.createStamp();
        System.out.println(stamp.toString());
        System.out.println(stamp.toString());
        System.out.println(stamp.toString());
    }
}

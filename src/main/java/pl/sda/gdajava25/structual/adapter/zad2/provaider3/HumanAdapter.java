package pl.sda.gdajava25.structual.adapter.zad2.provaider3;

import pl.sda.gdajava25.structual.adapter.zad2.IHuman;

import java.time.LocalDate;

public class HumanAdapter implements IHuman {
    private final Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public int getID() {
        return human.getId();
    }

    @Override
    public String getName() {
        return human.getName();
    }

    @Override
    public String getSurname() {
        return human.getSurname();
    }

    @Override
    public String getPesel() {
        return null;
    }

    @Override
    public LocalDate getBirthDate() {
        return null;
    }

    @Override
    public String toString() {
        return "Hi! My name is " + getName() + " " + getSurname();
    }
}

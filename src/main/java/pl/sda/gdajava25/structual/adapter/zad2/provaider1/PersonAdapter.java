package pl.sda.gdajava25.structual.adapter.zad2.provaider1;

import pl.sda.gdajava25.structual.adapter.zad2.IHuman;

import java.time.LocalDate;

public class PersonAdapter implements IHuman {
    private final Person person;

    public PersonAdapter(Person person) {
        this.person = person;
    }

    @Override
    public int getID() {
        return person.getId();
    }

    @Override
    public String getName() {
        return person.getName();
    }

    @Override
    public String getSurname() {
        return person.getSurname();
    }

    @Override
    public String getPesel() {
        return person.getPesel();
    }

    @Override
    public LocalDate getBirthDate() {
        return person.getBirthDate();
    }
    @Override
    public String toString() {
        return "Hi! My name is "+getName()+" "+getSurname()+". My pesel is "+getPesel()+" and i born in "+getBirthDate().getYear();
    }
}

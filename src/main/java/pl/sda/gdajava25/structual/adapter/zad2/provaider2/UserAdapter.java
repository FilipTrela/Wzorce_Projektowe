package pl.sda.gdajava25.structual.adapter.zad2.provaider2;

import pl.sda.gdajava25.structual.adapter.zad2.IHuman;

import java.time.LocalDate;

public class UserAdapter implements IHuman {
    private final User user;

    public UserAdapter(User user) {
        this.user = user;
    }

    @Override
    public int getID() {
        return user.getIdentifier();
    }

    @Override
    public String getName() {
        String[] surname = user.getNameAndSurname().split(" ");
        return surname[0];
    }

    @Override
    public String getSurname() {
        String[] surname = user.getNameAndSurname().split(" ",2);
        return surname[1];
    }

    @Override
    public String getPesel() {
        return user.getSocialIdentifier();
    }

    @Override
    public LocalDate getBirthDate() {
        return user.getBirthDate();
    }

    @Override
    public String toString() {
        return "Hi! My name is "+getName()+" "+getSurname()+". My pesel is "+getPesel()+" and i born in "+getBirthDate().getYear();

    }
}

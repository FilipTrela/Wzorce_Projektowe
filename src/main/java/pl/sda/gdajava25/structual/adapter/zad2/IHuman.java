package pl.sda.gdajava25.structual.adapter.zad2;

import java.time.LocalDate;

public interface IHuman {
    int getID();

    String getName();

    String getSurname();

    String getPesel();

    LocalDate getBirthDate();

    String toString();
}

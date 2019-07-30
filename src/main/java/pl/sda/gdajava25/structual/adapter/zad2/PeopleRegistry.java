package pl.sda.gdajava25.structual.adapter.zad2;

import pl.sda.gdajava25.structual.adapter.zad2.provaider1.FileDataProvider;
import pl.sda.gdajava25.structual.adapter.zad2.provaider1.Person;
import pl.sda.gdajava25.structual.adapter.zad2.provaider1.PersonAdapter;
import pl.sda.gdajava25.structual.adapter.zad2.provaider2.RandomDataProvider;
import pl.sda.gdajava25.structual.adapter.zad2.provaider2.User;
import pl.sda.gdajava25.structual.adapter.zad2.provaider2.UserAdapter;
import pl.sda.gdajava25.structual.adapter.zad2.provaider3.Human;
import pl.sda.gdajava25.structual.adapter.zad2.provaider3.HumanAdapter;
import pl.sda.gdajava25.structual.adapter.zad2.provaider3.StaticDataProvider;

import java.util.HashMap;
import java.util.Map;

public class PeopleRegistry {
    private final static FileDataProvider FILE_DATA_PROVIDER = new FileDataProvider();
    private final static RandomDataProvider RANDOM_DATA_PROVIDER = new RandomDataProvider();
    private final static StaticDataProvider STATIC_DATA_PROVIDER = new StaticDataProvider();
    private Map<Integer, IHuman> iHumanHashMap = new HashMap<>();


    public Map<Integer,IHuman> returnIHumanMap() {
        loadDataFromProvaider();
        return iHumanHashMap;
    }

    private void loadDataFromProvaider() {
        for (Person person : FILE_DATA_PROVIDER.getPeopleList()) {
            iHumanHashMap.put(person.getId(),new PersonAdapter(person));
        }
        for (User user : RANDOM_DATA_PROVIDER.getSystemUsersList()) {
            iHumanHashMap.put(user.getIdentifier(),new UserAdapter(user));
        }
        for (Human human : STATIC_DATA_PROVIDER.getHumanList()) {
            iHumanHashMap.put(human.getId(),new HumanAdapter(human));
        }
    }


    // TODO: pobierz wszystkich ludzi ze wszystkich systemów w jednakowym formacie.
}

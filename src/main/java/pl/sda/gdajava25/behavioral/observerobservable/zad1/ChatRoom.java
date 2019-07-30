package pl.sda.gdajava25.behavioral.observerobservable.zad1;


import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;

public class ChatRoom {
    public SimpleObjectProperty<String> messeage = new SimpleObjectProperty<>();

    public void addUser(ChangeListener<String> watcher) {
        messeage.addListener(watcher);
    }

    public void removeUser(ChangeListener<String> watcher) {
        messeage.removeListener(watcher);
    }

    public void sendNews(String news) {
        messeage.setValue(news);
    }


}

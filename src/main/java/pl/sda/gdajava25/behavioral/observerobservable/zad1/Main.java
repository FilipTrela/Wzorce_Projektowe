package pl.sda.gdajava25.behavioral.observerobservable.zad1;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addUser(new User("Filip"));
        chatRoom.addUser(new User("Paweł"));
        chatRoom.addUser(new User("Jacek"));
        chatRoom.addUser(new User("Wacek"));
        chatRoom.sendNews("Dupa dupa");

    }
}

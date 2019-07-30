package pl.sda.gdajava25.behavioral.observerobservable.zad1;


import java.util.Arrays;
import java.util.Vector;

public class WebPortal {
    Vector<ChatRoom> chatRooms = new Vector<>();

    public void addChatRoom(ChatRoom... chatRoom) {
        this.chatRooms.addAll(Arrays.asList(chatRoom));
    }

    public void removeChatRoom(ChatRoom... chatRoom) {
        this.chatRooms.removeAll(Arrays.asList(chatRoom));
    }

    public void printChats() {
        chatRooms.forEach(System.out::println);
    }
}

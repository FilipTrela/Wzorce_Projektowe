package pl.sda.gdajava25.creational.builder.zad3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MailServer {
    private List<Client> klienci = new ArrayList<>();


    public void connect(Client... c) {
        klienci.addAll(Arrays.asList(c));
    }

    public void disconnect(Client c) {
        klienci.remove(c);
    }

    public void sendMessage(Mail m, Client sender) {
        m.setDataOdbioru(LocalDateTime.now());
        for (Client k : klienci) {
            if (!k.equals(sender))
                k.readMail(m);
        }
    }
}

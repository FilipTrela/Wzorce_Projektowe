package pl.sda.gdajava25.creational.builder.zad3;

public class Main {
    public static void main(String[] args) {
        MailServer mailServer = new MailServer();
        Mail.Builder builder = new Mail.Builder();
        Client client1 = new Client("Jan");
        Client client3 = new Client("Paweł");
        Client client2 = new Client("Jacek");
        Client client4 = new Client("Placek");
        Client client5 = new Client("Gacek");
        Client client6 = new Client("Andzrzej");
        mailServer.connect(client1, client2, client3, client4, client5, client6);
        Mail mail = builder.setCzySpam(false).setCzySzyfrowane(false).setNadawca(client3).setTresc("Test").createMail();
        mailServer.sendMessage(mail, client3);

    }
}

package pl.sda.gdajava25.creational.builder.zad3;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;
@ToString
@Data
public class Mail {
    private String tresc;
    private Client nadawca;
    private LocalDateTime dataNadania;
    private LocalDateTime dataOdbioru;
    private String nazwaSerweraPosredniego;
    private String nazwaSkrzynkiPocztowej;
    private String protokolKomunikacyjny;
    private MessageTypeEnum messageType;
    private boolean czySzyfrowane;
    private boolean czySpam;

    public Mail(String tresc, Client nadawca, LocalDateTime dataNadania, LocalDateTime dataOdbioru, String nazwaSerweraPosredniego, String nazwaSkrzynkiPocztowej, String protokolKomunikacyjny, MessageTypeEnum messageType, boolean czySzyfrowane, boolean czySpam) {
        this.tresc = tresc;
        this.nadawca = nadawca;
        this.dataNadania = dataNadania;
        this.dataOdbioru = dataOdbioru;
        this.nazwaSerweraPosredniego = nazwaSerweraPosredniego;
        this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
        this.protokolKomunikacyjny = protokolKomunikacyjny;
        this.messageType = messageType;
        this.czySzyfrowane = czySzyfrowane;
        this.czySpam = czySpam;
    }

    public static class Builder {

        private String tresc;
        private Client nadawca;
        private LocalDateTime dataNadania = LocalDateTime.now();
        private LocalDateTime dataOdbioru;
        private String nazwaSerweraPosredniego;
        private String nazwaSkrzynkiPocztowej;
        private String protokolKomunikacyjny;
        private MessageTypeEnum messageType = MessageTypeEnum.UNKNOWN;
        private boolean czySzyfrowane;
        private boolean czySpam;

        public Builder setTresc(String tresc) {
            this.tresc = tresc;
            return this;
        }

        public Builder setNadawca(Client nadawca) {
            this.nadawca = nadawca;
            return this;
        }

        public Builder setDataNadania(LocalDateTime dataNadania) {
            this.dataNadania = dataNadania;
            return this;
        }

        public Builder setDataOdbioru(LocalDateTime dataOdbioru) {
            this.dataOdbioru = dataOdbioru;
            return this;
        }

        public Builder setNazwaSerweraPosredniego(String nazwaSerweraPosredniego) {
            this.nazwaSerweraPosredniego = nazwaSerweraPosredniego;
            return this;
        }

        public Builder setNazwaSkrzynkiPocztowej(String nazwaSkrzynkiPocztowej) {
            this.nazwaSkrzynkiPocztowej = nazwaSkrzynkiPocztowej;
            return this;
        }

        public Builder setProtokolKomunikacyjny(String protokolKomunikacyjny) {
            this.protokolKomunikacyjny = protokolKomunikacyjny;
            return this;
        }

        public Builder setMessageType(MessageTypeEnum messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder setCzySzyfrowane(boolean czySzyfrowane) {
            this.czySzyfrowane = czySzyfrowane;
            return this;
        }

        public Builder setCzySpam(boolean czySpam) {
            this.czySpam = czySpam;
            return this;
        }

        public Mail createMail() {
            return new Mail(tresc, nadawca, dataNadania, dataOdbioru, nazwaSerweraPosredniego, nazwaSkrzynkiPocztowej, protokolKomunikacyjny, messageType, czySzyfrowane, czySpam);
        }
    }
}

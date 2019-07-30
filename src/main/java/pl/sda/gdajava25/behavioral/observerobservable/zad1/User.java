package pl.sda.gdajava25.behavioral.observerobservable.zad1;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User implements ChangeListener<String> {
    private String name;


    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println(name + " :" + newValue);
    }
}

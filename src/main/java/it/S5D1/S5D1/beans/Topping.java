package it.S5D1.S5D1.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Topping extends VoceMenu {

    public Topping(String nome, double prezzo, double calorie) {
        super(nome, prezzo, calorie);
    }
}

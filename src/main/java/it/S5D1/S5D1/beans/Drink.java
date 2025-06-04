package it.S5D1.S5D1.beans;

import it.S5D1.S5D1.enumerating.TipoDrink;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Drink extends VoceMenu {
    private TipoDrink tipoDrink;

    public Drink(String nome, double prezzo, double calorie, TipoDrink tipoDrink) {
        super(nome, prezzo, calorie);
        this.tipoDrink = tipoDrink;
    }
}


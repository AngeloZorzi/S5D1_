package it.S5D1.S5D1.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Prodotto {

    private String nome;
    private double prezzo;
    private int calorie;
}

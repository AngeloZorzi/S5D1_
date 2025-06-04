package it.S5D1.S5D1.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class VoceMenu {
    private String nome;
    private double prezzo;
    private double calorie;
}

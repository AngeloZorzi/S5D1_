package it.S5D1.S5D1.beans;


import it.S5D1.S5D1.enumerating.TipoDrink;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)

public class Drink extends Prodotto{
    private TipoDrink tipoDrink;
}

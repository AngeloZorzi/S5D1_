package it.S5D1.S5D1.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Pizza extends VoceMenu {

    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nome, double prezzo, int calorie) {
        super(nome, prezzo, calorie);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}

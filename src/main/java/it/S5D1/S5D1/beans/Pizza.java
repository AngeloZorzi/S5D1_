package it.S5D1.S5D1.beans;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza extends VoceMenu {
    private boolean isPizza;
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(String nome, int calorie, double prezzo, boolean isPizza) {
        super(nome, calorie, prezzo);
        this.isPizza = isPizza;
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
        setPrezzo(getPrezzo() + topping.getPrezzo());
        setCalorie(getCalorie() + topping.getCalorie());
    }
}

package it.S5D1.S5D1.configuration;

import it.S5D1.S5D1.beans.Drink;
import it.S5D1.S5D1.beans.Pizza;
import it.S5D1.S5D1.beans.Topping;
import it.S5D1.S5D1.enumerating.TipoDrink;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public static Pizza margherita() {
        Pizza p = new Pizza("Margherita", 4.50, 1104);
        return p;
    }

    public static Pizza diavola() {
        Pizza p = new Pizza("Diavola", 5.50, 1350);
        return p;
    }

    public static Topping salame() {
        return new Topping("Salame Piccante", 1.00, 86);
    }

    public static Drink cola() {
        return new Drink("Coca-Cola", 2.50, 150, TipoDrink.ANALCOLICO);
    }

    public static Drink acqua() {
        return new Drink("Acqua Naturale", 1.00, 0, TipoDrink.ANALCOLICO);
    }

    public static Drink birra() {
        return new Drink("Birra", 3.50, 230, TipoDrink.ALCOLICO);
    }
}

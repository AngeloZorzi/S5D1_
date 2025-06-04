package it.S5D1.S5D1.configuration;

import it.S5D1.S5D1.beans.*;
import it.S5D1.S5D1.enumerating.StatoTavolo;
import it.S5D1.S5D1.enumerating.TipoDrink;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${coperto.costo}")
    private double costoCoperto;

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 1104, 4.50, true);
    }

    @Bean
    public Pizza diavola() {
        return new Pizza("Diavola", 1300, 5.50, true);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame Piccante", 86.0, 1.00);
    }

    @Bean
    public Drink cola() {
        return new Drink("Coca-Cola", 150, 2.50, TipoDrink.ANALCOLICO);
    }

    @Bean
    public Drink acqua() {
        return new Drink("Acqua Naturale", 0, 1.00, TipoDrink.ANALCOLICO);
    }

    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, 8, StatoTavolo.LIBERO, costoCoperto);
    }
}

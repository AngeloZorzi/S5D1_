package it.S5D1.S5D1;

import it.S5D1.S5D1.beans.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Runner.class);

    @Autowired private Pizza margherita;
    @Autowired private Pizza diavola;
    @Autowired private Topping salame;
    @Autowired private Drink cola;
    @Autowired private Drink acqua;
    @Autowired private Tavolo tavolo1;

    @Override
    public void run(String... args) throws Exception {
        diavola.addTopping(salame);

        Menu menu = new Menu();
        menu.addVoce(margherita);
        menu.addVoce(diavola);
        menu.addVoce(cola);
        menu.addVoce(acqua);

        Ordine ordine = new Ordine(3, tavolo1);
        ordine.aggiungiElemento(margherita);
        ordine.aggiungiElemento(diavola);
        ordine.aggiungiElemento(cola);
        ordine.aggiungiElemento(acqua);

        log.info("===== DETTAGLI ORDINE =====");
        log.info("Numero Ordine: {}", ordine.getNumeroOrdine());
        log.info("Tavolo: {}", ordine.getTavolo().getNumero());
        log.info("Coperti: {}", ordine.getCoperti());
        log.info("Stato: {}", ordine.getStato());
        log.info("Ora acquisizione: {}", ordine.getOraAcquisizione());
        log.info("Elementi ordinati:");
        ordine.getElementi().forEach(e -> log.info(" - {} (€{})", e.getNome(), e.getPrezzo()));
        log.info("TOTALE: €{}", ordine.getTotale());
    }
}

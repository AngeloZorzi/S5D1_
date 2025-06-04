package it.S5D1.S5D1;

import it.S5D1.S5D1.beans.*;
import it.S5D1.S5D1.configuration.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Autowired private Pizza margherita;
    @Autowired private Pizza diavola;
    @Autowired private Topping salame;
    @Autowired private Drink cola;
    @Autowired private Drink acqua;
    @Autowired private Tavolo tavolo;

    @Override
    public void run(String... args) throws Exception {

        diavola.addTopping(salame);

        Menu menu = new Menu();
        menu.addVoce(margherita);
        menu.addVoce(diavola);
        menu.addVoce(cola);
        menu.addVoce(acqua);

        Ordine ordine = new Ordine(2, tavolo);
        ordine.aggiungiElemento(margherita);
        ordine.aggiungiElemento(diavola);
        ordine.aggiungiElemento(cola);

        logger.info("====== DETTAGLI ORDINE ======");
        logger.info("Numero ordine: {}", ordine.getNumeroOrdine());
        logger.info("Tavolo: {}", ordine.getTavolo().getNumero());
        logger.info("Coperti: {}", ordine.getCoperti());
        logger.info("Stato: {}", ordine.getStato());
        logger.info("Ora acquisizione: {}", ordine.getOraAcquisizione());

        logger.info("Elementi ordinati:");
        ordine.getElementi().forEach(e ->
                logger.info(" - {} (€{})", e.getNome(), e.getPrezzo())
        );

        logger.info("TOTALE: €{}", ordine.getTotale());
    }
}

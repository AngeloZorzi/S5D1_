package it.S5D1.S5D1;

import it.S5D1.S5D1.beans.*;
import it.S5D1.S5D1.beans.Menu;
import it.S5D1.S5D1.beans.Ordine;
import it.S5D1.S5D1.beans.Tavolo;
import it.S5D1.S5D1.configuration.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class);

    @Override
    public void run(String... args) throws Exception {

        Menu menu = new Menu();
        Pizza margherita = AppConfig.margherita();
        Pizza diavola = AppConfig.diavola();
        diavola.addTopping(AppConfig.salame());

        Drink acqua = AppConfig.acqua();
        Drink cola = AppConfig.cola();

        menu.addVoce(margherita);
        menu.addVoce(diavola);
        menu.addVoce(acqua);
        menu.addVoce(cola);


        Tavolo tavolo = new Tavolo(1, 4, 2.0);  // numero, max coperti, costo coperto


        Ordine ordine = new Ordine(2, tavolo);  // 2 coperti
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

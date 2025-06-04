package it.S5D1.S5D1.beans;

import it.S5D1.S5D1.enumerating.StatoOrdine;
import lombok.Data;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class Ordine {
    private static int contatore = 1;

    private int numeroOrdine;
    private StatoOrdine stato;
    private int coperti;
    private LocalTime oraAcquisizione;
    private Tavolo tavolo;
    private List<VoceMenu> elementi = new ArrayList<>();

    public Ordine(int coperti, Tavolo tavolo) {
        this.numeroOrdine = contatore++;
        this.stato = StatoOrdine.IN_CORSO;
        this.oraAcquisizione = LocalTime.now();
        this.coperti = coperti;
        this.tavolo = tavolo;
        this.tavolo.occupa();
    }

    public void aggiungiElemento(VoceMenu voce) {
        this.elementi.add(voce);
    }

    public double getTotale() {
        double totale = coperti * tavolo.getCostoCoperto();
        for (VoceMenu voce : elementi) {
            totale += voce.getPrezzo();
        }
        return totale;
    }
}

package it.S5D1.S5D1.beans;

import it.S5D1.S5D1.enumerating.StatoOrdine;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private static int contatore = 1;
    private int numeroOrdine;
    private StatoOrdine stato;
    private int coperti;
    private LocalTime oraAcquisizione;
    private Tavolo tavolo;
    private List<VoceMenu> elementi;

    public Ordine(int coperti, Tavolo tavolo) {
        this.numeroOrdine = contatore++;
        this.stato = StatoOrdine.IN_CORSO;
        this.coperti = coperti;
        this.oraAcquisizione = LocalTime.now();
        this.tavolo = tavolo;
        this.elementi = new ArrayList<>();
        tavolo.occupa();
    }

    public void aggiungiElemento(VoceMenu e) {
        elementi.add(e);
    }

    public double getTotale() {
        double somma = coperti * tavolo.getCostoCoperto();
        for (VoceMenu e : elementi) {
            somma += e.getPrezzo();
        }
        return somma;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public StatoOrdine getStato() {
        return stato;
    }

    public LocalTime getOraAcquisizione() {
        return oraAcquisizione;
    }

    public List<VoceMenu> getElementi() {
        return elementi;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setStato(StatoOrdine stato) {
        this.stato = stato;
    }
}

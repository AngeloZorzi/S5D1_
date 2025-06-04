package it.S5D1.S5D1.beans;

import it.S5D1.S5D1.enumerating.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tavolo {
    private int numero;
    private int copertiMax;
    private StatoTavolo stato = StatoTavolo.LIBERO;
    private double costoCoperto;

    public Tavolo(int numero, int copertiMax) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.stato = StatoTavolo.LIBERO;
    }

    public Tavolo(int numero, int copertiMax, double costoCoperto) {
        this.numero = numero;
        this.copertiMax = copertiMax;
        this.costoCoperto = costoCoperto;
        this.stato = StatoTavolo.LIBERO;
    }
}
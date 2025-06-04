package it.S5D1.S5D1.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tavolo {
    private int numero;
    private int maxCoperti;
    private boolean occupato = false;
    private double costoCoperto;

    public Tavolo(int numero, int maxCoperti, double costoCoperto) {
        this.numero = numero;
        this.maxCoperti = maxCoperti;
        this.costoCoperto = costoCoperto;
        this.occupato = false;
    }

    public void occupa() {
        this.occupato = true;
    }

    public void libera() {
        this.occupato = false;
    }
}

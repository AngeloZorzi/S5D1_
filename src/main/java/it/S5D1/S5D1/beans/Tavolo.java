package it.S5D1.S5D1.beans;

public class Tavolo {
    private int numero;
    private int maxCoperti;
    private boolean occupato;
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

    public boolean isOccupato() {
        return occupato;
    }

    public double getCostoCoperto() {
        return costoCoperto;
    }

    public int getNumero() {
        return numero;
    }

    public int getMaxCoperti() {
        return maxCoperti;
    }
}

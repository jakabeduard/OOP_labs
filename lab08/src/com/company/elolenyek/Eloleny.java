package com.company.elolenyek;

public class Eloleny {



  protected   String elohely;
    protected   String megnevezes;
    protected   int egyedekSzama;

    public Eloleny(String elohely, String megnevezes, int egyedekSzama) {
        this.elohely = elohely;
        this.megnevezes = megnevezes;
        this.egyedekSzama = egyedekSzama;
    }

    public String getElohely() {
        return elohely;
    }
    public String getMegnevezes() {
        return megnevezes;


    }
    @Override
    public String toString() {

        return "Elohely:\n"+ this.elohely + " Megnevezes:\n"+ this.megnevezes + " Egyedekszama:\n"+ this.egyedekSzama;
    }
}
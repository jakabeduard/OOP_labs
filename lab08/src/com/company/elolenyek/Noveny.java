package com.company.elolenyek;

public class Noveny extends Eloleny{

    private String termes;
    private boolean fotoszintetizal;


    public Noveny(String elohely, String megnevezes, int egyedekSzama, String termes, boolean fotoszintetizal) {
        super(elohely, megnevezes, egyedekSzama);
        this.termes = termes;
        this.fotoszintetizal = fotoszintetizal;
    }

    public boolean getFotoszintetizal() {
        return fotoszintetizal;
    }


    public String getTermes() {
        return termes;
    }

    @Override
    public String toString() {
        return "NOVENY"+"termes"+this.termes+" " +super.toString();

    }

}

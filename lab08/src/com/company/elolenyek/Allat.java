package com.company.elolenyek;

public class Allat extends Eloleny {


    private AllatTipus tipus;
    private int labakSzama;

    public Allat(String elohely, String megnevezes, int egyedekSzama, AllatTipus tipus, int labakSzama) {
        super(elohely, megnevezes, egyedekSzama);
        this.tipus = tipus;
        this.labakSzama = labakSzama;
    }

    public int getLabakSzama() {
        return labakSzama;
    }
    public AllatTipus getTipus() {
        return tipus;
    }
    @Override
    public String toString() {
        return "Allat tipus:" + tipus+ "labakSzama:"+ labakSzama +super.toString();

    }
}

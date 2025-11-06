package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JatekModell {
    private List<AjtoModell> ajtok;
    private JatekosModell jatekos;

    public JatekModell() {
        ajtok = new ArrayList<>();
        jatekos = new JatekosModell();
        ujJatek();
    }

    public void ujJatek() {
        ajtok.clear();
        Random rnd = new Random();
        int nyeremenyIndex = rnd.nextInt(3);
        for (int i = 0; i < 3; i++) {
            ajtok.add(new AjtoModell(i == nyeremenyIndex, false));
        }
        jatekos.setValasztottAjto(-1);
        jatekos.setValtoztat(false);
    }

    public List<AjtoModell> getAjtok() {
        return ajtok;
    }

    public JatekosModell getJatekos() {
        return jatekos;
    }

    /** Nem getter, hanem logika: visszaadja, melyik ajtót fedheti fel a műsorvezető. */
    public int kivalasztMusorvezetoAjtot() {
        int valasztott = jatekos.getValasztottAjto();
        if (valasztott < 0) return -1; // még nincs választás

        for (int i = 0; i < ajtok.size(); i++) {
            if (i != valasztott && !ajtok.get(i).isNyeremeny()) {
                return i;
            }
        }
        return -1;
    }

    public boolean isNyeres() {
        int valasztott = jatekos.getValasztottAjto();
        if (valasztott >= 0 && valasztott < ajtok.size()) {
            return ajtok.get(valasztott).isNyeremeny();
        }
        return false;
    }

    @Override
    public String toString() {
        return "JatekModell{" + "ajtok=" + ajtok + ", jatekos=" + jatekos + '}';
    }
}
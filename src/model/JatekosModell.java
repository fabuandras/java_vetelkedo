package model;

public class JatekosModell {
    private boolean valtoztat;
    private int valasztottAjto;

    public void JatekosModell() {
        this.valtoztat = false;
        this.valasztottAjto = -1;
    }
    
    public JatekosModell(boolean valtoztat, int valasztottAjto) {
        this.valtoztat = valtoztat;
        this.valasztottAjto = valasztottAjto;
    }
    
    public boolean isValtoztat() {
        return valtoztat;
    }
    
    public void setValtoztat(boolean valtoztat) {
        this.valtoztat = valtoztat;
    }

    public int getValasztottAjto() {
        return valasztottAjto;
    }

    public void setValasztottAjto(int valasztottAjto) {
        this.valasztottAjto = valasztottAjto;
    }

    @Override
    public String toString() {
        return "JatekosModell{" + "valasztottAjto=" + valasztottAjto + ", valtott=" + valtoztat + '}';
    }
    
}

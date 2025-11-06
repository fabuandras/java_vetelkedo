package model;

public class AjtoModell {
    private boolean nyeremeny;
    private boolean allapot;

    public AjtoModell(boolean nyeremeny, boolean allapot) {
        this.nyeremeny = nyeremeny;
        this.allapot = allapot;
    }

    public boolean isNyeremeny() {
        return nyeremeny;
    }

    public boolean isAllapot() {
        return allapot;
    }

    public void setNyeremeny(boolean nyeremeny) {
        this.nyeremeny = nyeremeny;
    }

    public void setAllapot(boolean allapot) {
        this.allapot = allapot;
    }
}

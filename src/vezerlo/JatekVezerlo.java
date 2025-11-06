package vezerlo;

import model.JatekModell;
import nezet.GuiJatekNezet;

public class JatekVezerlo {
    private GuiJatekNezet nezet;
    private JatekModell modell;
    
    public JatekVezerlo(GuiJatekNezet nezet) {
        this.nezet = nezet;
        this.modell = new JatekModell();
    }
}

package ProjectGit.SklepZoologiczny;

import java.util.ArrayList;
import java.util.List;

public class Zamowienie {
    private Zwierze zwierze;
    private int ilosc;



    public Zamowienie(Zwierze zwierze, int ilosc) {
        this.zwierze = zwierze;
        this.ilosc = ilosc;
    }


    public Zwierze getZwierze() {
        return zwierze;
    }

    public int getIlosc() {
        return ilosc;
    }


    public static Zamowienie zamowienie1 = new Zamowienie(Zwierze.zwierze1, 2);
    public static Zamowienie zamowienie2 = new Zamowienie(Zwierze.zwierze3, 3);
    public static Zamowienie zamowienie3 = new Zamowienie(Zwierze.zwierze5, 5);


}

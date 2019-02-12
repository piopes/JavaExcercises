package ProjectGit.SklepZoologiczny;

public class Zwierze {

    private String rodzaj;
    private String gatunek;
    private int cena;

    public Zwierze (String rodzaj, String gatunek, int cena){
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.cena = cena;
    }

    public String getRodzaj() {
        return rodzaj;
    }

    public String getGatunek() {
        return gatunek;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return
                "rodzaj: " + rodzaj+
                ", gatunek: " + gatunek +
                ", cena: " + cena+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Zwierze zwierze = (Zwierze) o;

        if (cena != zwierze.cena) return false;
        if (!rodzaj.equals(zwierze.rodzaj)) return false;
        return gatunek.equals(zwierze.gatunek);
    }

    @Override
    public int hashCode() {
        int result = rodzaj.hashCode();
        result = 31 * result + gatunek.hashCode();
        result = 31 * result + cena;
        return result;
    }

    public static Zwierze zwierze1 = new Zwierze("ssak", "pies", 1500);
    public static Zwierze zwierze2 = new Zwierze("ssak", "kot", 300);
    public static Zwierze zwierze3 = new Zwierze("płaz", "żaba", 25);
    public static Zwierze zwierze4 = new Zwierze("płaz", "gekon", 300);
    public static Zwierze zwierze5 = new Zwierze("gad", "żółw", 100);
    public static Zwierze zwierze6 = new Zwierze("gad", "pyton", 220);
    public static Zwierze zwierze7 = new Zwierze("ssak", "pies", 450);
}

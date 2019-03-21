package ProjectGit.Wzorce.Builder.Builder_Ex;

public class Pracownicy {

    private String imie;
    private String nazwisko;
    private long nip;
    private int regon;
    private boolean czyPlatnikVat;
    private String szkolnePrzezwisko;

    private Pracownicy(Builder builder){
        this.imie = builder.imie;
        this.nazwisko = builder.nazwisko;
        this.nip = builder.nip;
        this.regon = builder.regon;
        this.czyPlatnikVat = builder.czyPlatnikVat;
        this.szkolnePrzezwisko = builder.szkolnePrzezwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getNip() {
        return nip;
    }

    public int getRegon() {
        return regon;
    }

    public boolean isCzyPlatnikVat() {
        return czyPlatnikVat;
    }

    public String getSzkolnePrzezwisko() {
        return szkolnePrzezwisko;
    }

    @Override
    public String toString() {
        return "Pracownicy{" +
                "imie:'" + imie + '\'' +
                ", nazwisko:'" + nazwisko + '\'' +
                ", nip:" + nip +
                ", regon:" + regon +
                ", czyPlatnikVat:" + czyPlatnikVat +
                ", szkolnePrzezwisko:'" + szkolnePrzezwisko + '\'' +
                '}';
    }

    public static class Builder{

        private String imie;
        private String nazwisko;
        private long nip;
        private int regon;
        private boolean czyPlatnikVat;
        private String szkolnePrzezwisko;

        public Builder imie(String imie){
            this.imie = imie;
            return this;
        }

        public Builder nazwisko(String nazwisko){
            this.nazwisko = nazwisko;
            return this;
        }

        public Builder nip(long nip){
            this.nip = nip;
            return this;
        }

        public Builder regon(int regon){
            this.regon = regon;
            return this;
        }

        public Builder czyPlatnikVat(boolean czyPlatnikVat){
            this.czyPlatnikVat = czyPlatnikVat;
            return this;
        }

        public Builder szkolnePrzezwisko(String szkolnePrzezwisko){
            this.szkolnePrzezwisko = szkolnePrzezwisko;
            return this;
        }

        public Pracownicy build(){
            return new Pracownicy(this);
        }


    }

}

package ProjectGit.Wzorce.FabrykaZadanie.FabrykaAutoZEnumem;

public abstract class Produkt {

    private String nazwa;

    public Produkt(String nazwa) {
        this.nazwa = nazwa;
    }


    public String getNazwa() {
        return nazwa;
    }

}

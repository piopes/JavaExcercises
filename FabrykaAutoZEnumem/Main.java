package ProjectGit.Wzorce.FabrykaZadanie.FabrykaAutoZEnumem;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fabrka fabrka = new Fabrka();
        List<Produkt> listaPojazdow = new ArrayList<>();

        Produkt produkt1 = fabrka.createProduct(Pogoda.SŁONECZNIE, Dystans.BLISKO);
        listaPojazdow.add(produkt1);
        Produkt produkt2 = fabrka.createProduct(Pogoda.WIETRZNIE, Dystans.DALEKO);
        listaPojazdow.add(produkt2);
        Produkt produkt3 = fabrka.createProduct(Pogoda.WIETRZNIE, Dystans.BLISKO);
        listaPojazdow.add(produkt3);
        Produkt produkt4 = fabrka.createProduct(Pogoda.SŁONECZNIE, Dystans.DALEKO);
        listaPojazdow.add(produkt4);

        for (Produkt produkt: listaPojazdow){
            System.out.println(produkt.getNazwa());
        }


    }
}

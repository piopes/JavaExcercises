package ProjectGit.SklepZoologiczny;

import java.time.ZoneOffset;
import java.util.*;

public class SklepZoologiczny {

    private static final Comparator<Zwierze> WG_GATUNKU = new Comparator<Zwierze>() {
        @Override
        public int compare(Zwierze o1, Zwierze o2) {
            return o1.getGatunek().compareTo(o2.getGatunek());
        }
    };

    List<Zwierze> listaWszystkichZwierzatObecnychWSklepie = new ArrayList<>();
    Set<Zwierze> katalogDostepnychWSklepieZwierzat = new TreeSet<>(WG_GATUNKU);
    List<Zamowienie>listaZamowien = new ArrayList<>();


    public void dodajZwierze(Zwierze zwierze) {
        listaWszystkichZwierzatObecnychWSklepie.add(zwierze);
        katalogDostepnychWSklepieZwierzat.add(zwierze);
    }

    public void kupionoZwierze(Zwierze zwierze) {
        listaWszystkichZwierzatObecnychWSklepie.remove(zwierze);
        katalogDostepnychWSklepieZwierzat.remove(zwierze);
    }

    public List<Zwierze> znajdzRodzaj(String rodzaj) {
        List<Zwierze> zwierzetaPoRodzaju = new ArrayList<>();

        for (Zwierze zwierze : listaWszystkichZwierzatObecnychWSklepie) {
            if (zwierze.getRodzaj().equals(rodzaj)) {
                zwierzetaPoRodzaju.add(zwierze);
            }
        }
        if (zwierzetaPoRodzaju.isEmpty()) {
            System.out.println("zwierzę tego todzaju niedostępne w sklepie");
        }
        return zwierzetaPoRodzaju;
    }

    public List<Zwierze> znajdzGatunek(String gatunek) {
        List<Zwierze> zwierzetaPoGatunku = new ArrayList<>();

        for (Zwierze zwierze : listaWszystkichZwierzatObecnychWSklepie) {
            if (zwierze.getGatunek().equals(gatunek)) {
                zwierzetaPoGatunku.add(zwierze);
            }
        }
        if (zwierzetaPoGatunku.isEmpty()) {
            System.out.println("zwierzę tego todzaju niedostępne w sklepie");
        }
        return zwierzetaPoGatunku;
    }

    public void wypiszZKataloguZwierzatDostepneZwierzetaOproczGatunku(String gatunek) {
        System.out.print("zwierzęta w katalogu z wykluczonym gatunkiem:  \n\n");
        for (Zwierze zwierze : katalogDostepnychWSklepieZwierzat) {
            if (!(zwierze.getGatunek().equals(gatunek))) {
                System.out.println(zwierze);
            }
        }
    }

    public  int znajdzLiczbeDostepnychWSklepieZwierzat(String gatunek){
        int counter = 0;
        for (Zwierze zwierze : listaWszystkichZwierzatObecnychWSklepie ) {
            if (zwierze.getGatunek().equals(gatunek)) {
                counter++;
            }
        } return counter;
    }

    public  int obliczSumeZamowienia(Zamowienie zamowienie) {
        return zamowienie.getIlosc() * zamowienie.getZwierze().getCena();
    }





    public static void main(String[] args) {

        SklepZoologiczny sklepZoologiczny = new SklepZoologiczny();

        sklepZoologiczny.dodajZwierze(Zwierze.zwierze1);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze2);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze3);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze4);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze5);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze6);
        sklepZoologiczny.dodajZwierze(Zwierze.zwierze7);

        sklepZoologiczny.listaZamowien.add(Zamowienie.zamowienie1);
        sklepZoologiczny.listaZamowien.add(Zamowienie.zamowienie2);
        sklepZoologiczny.listaZamowien.add(Zamowienie.zamowienie3);




        System.out.println("Lista zwierząt w sklepie: \n" + sklepZoologiczny.listaWszystkichZwierzatObecnychWSklepie);

        System.out.println("------------------------------------------------------");

        sklepZoologiczny.kupionoZwierze(Zwierze.zwierze3);
        System.out.println("Lista zwierząt w sklepie: \n" + sklepZoologiczny.listaWszystkichZwierzatObecnychWSklepie);

        System.out.println("------------------------------------------------------");

        System.out.println("Lista zwierząt wg rodzaju: \n" + sklepZoologiczny.znajdzRodzaj("płaz"));

        System.out.println("------------------------------------------------------");

        System.out.println("Lista zwierząt wg gatunku: \n" + sklepZoologiczny.znajdzGatunek("pies"));

        System.out.println("------------------------------------------------------");

        sklepZoologiczny.wypiszZKataloguZwierzatDostepneZwierzetaOproczGatunku("żaba");

        System.out.println("------------------------------------------------------");

        System.out.println("liczba zwierząt w sklepie tego gatunku to: " + sklepZoologiczny.znajdzLiczbeDostepnychWSklepieZwierzat("kot") +" szt");

        System.out.println("------------------------------------------------------");

        System.out.println("wartość zamówienia pierwszego: "+sklepZoologiczny.obliczSumeZamowienia(Zamowienie.zamowienie1) + "zł");
        System.out.println("wartość zamówienia drugiego: "+sklepZoologiczny.obliczSumeZamowienia(Zamowienie.zamowienie2)+ "zł");
        System.out.println("wartość zamówienia trzeciego: "+sklepZoologiczny.obliczSumeZamowienia(Zamowienie.zamowienie3)+ "zł");
    }

}

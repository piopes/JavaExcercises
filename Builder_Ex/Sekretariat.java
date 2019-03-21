package ProjectGit.Wzorce.Builder.Builder_Ex;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Sekretariat {

    public static void main(String[] args) {

        Pracownicy p1 = new Pracownicy.Builder()
                .imie("Mikołaj")
                .nazwisko("Kopernik")
                .nip(5732342234l)
                .czyPlatnikVat(true)
                .szkolnePrzezwisko("Miko")
                .regon(23445677)
                .build();

        Pracownicy p2 = new Pracownicy.Builder()
                .imie("Steve")
                .nazwisko("Jobs")
                .regon(34567784)
                .nip(2341234567l)
                .szkolnePrzezwisko("Stevie")
                .czyPlatnikVat(false)
                .build();

        Pracownicy p3 = new Pracownicy.Builder()
                .imie("Robin")
                .nazwisko("Hood")
                .nip(574233334l)
                .czyPlatnikVat(true)
                .szkolnePrzezwisko("Hoodie")
                .regon(2344564)
                .build();


        Set<Pracownicy> pracownicy = new HashSet<>();
        Collections.addAll(pracownicy,p1,p2,p3);

        for (Pracownicy x:pracownicy){
            System.out.println(x);
        }
    }
}


package ProjectGit.Wzorce.FabrykaZadanie.FabrykaAutoZEnumem;


public class Fabrka {

    public Fabrka(){}


    public Produkt createProduct(Pogoda pogoda, Dystans dystans){
        Produkt produkt;

        if (pogoda == pogoda.SŁONECZNIE && dystans == dystans.BLISKO){
            return produkt = new Rower("Wigry 3");
        }
        else if(pogoda == pogoda.SŁONECZNIE && dystans == dystans.DALEKO){
            return produkt = new Kabrio("BMW Z4");
        }
        else {
            return produkt = new Samochod("Audi");
        }
    }


}


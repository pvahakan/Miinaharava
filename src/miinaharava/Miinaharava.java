package miinaharava;

/**
 * @author Pauli Vähäkangas
 */
public class Miinaharava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Kayttoliittyma kl = new Kayttoliittyma();
        kl.tulostaValikko();
        kl.kysyValinta();
        
        /*
        Kentta kentta = new Kentta(3);
        kentta.luoKentta();
        kentta.asetaMiinat(3);
        //kentta.tarkistaRuudut();
        kentta.tulosta();
        */
    }

}

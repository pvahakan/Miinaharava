package miinaharava;

import java.util.Random;

/**
 * @author Pauli Vähäkangas
 */
public class Kentta {

    private int koko;
    private Ruutu[][] pelialusta;
    private Random random;

    public Kentta(int koko) {
        this.koko = koko;
        this.pelialusta = new Ruutu[koko][koko];

        this.random = new Random();
    }

    /**
     * Tehdään kenttä, joka koostuu ruutu-olioista
     */
    public void luoKentta() {
        for (int i = 0; i < koko; i++) {
            for (int j = 0; j < koko; j++) {
                Ruutu r = new Ruutu(i, j);
                this.pelialusta[i][j] = r;
            }

        }
        System.out.println("Kentän luonti onnistui!");
    }

    /**
     * Arpoo (x, y) -pistepareja ja asettaa niihin miinan
     *
     * @param miinojenLkm montako miinaa laitetaan
     */
    public void asetaMiinat(int miinojenLkm) {
        for (int i = 0; i < miinojenLkm; i++) {
            int x = random.nextInt(this.koko);
            int y = random.nextInt(this.koko);

            while (this.pelialusta[x][y].getMiina()) {
                x = random.nextInt(this.koko);
                y = random.nextInt(this.koko);

                System.out.println("Sama arvo tuli!");
            }
            System.out.println("Miina (" + x + ", " + y + ")");
            this.pelialusta[x][y].setMiina();

        }

    }

    public void tarkistaRuudut() {
        for (Ruutu rivi[] : this.pelialusta) {
            for (Ruutu r : rivi) {
                r.tulostaRuutu();
            }
        }
    }

    public void tulosta() {
        for (int i = 0; i < koko; i++) {
            for (int j = 0; j < koko; j++) {
                if (pelialusta[i][j].getMiina() == true) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println("");
        }
    }

}

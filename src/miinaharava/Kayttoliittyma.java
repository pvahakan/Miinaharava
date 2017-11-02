package miinaharava;

import java.util.Scanner;

/**
 * @author Pauli Vähäkangas
 */
public class Kayttoliittyma {

    private Scanner scanner;
    private int valinta;

    public Kayttoliittyma() {
        this.scanner = new Scanner(System.in);
        this.valinta = 0;
    }

    public void tulostaValikko() {
        System.out.println("Pelaa   (1)");
        System.out.println("Poistu  (2)");
    }

    public void kysyValinta() {
        System.out.print("> ");
        this.valinta = scanner.nextInt();
    }

    public void tarkistaValinta() {
        switch (this.valinta) {
            case 1:
                System.out.println("Pelataan");
                break;
            case 2:
                System.out.println("Lopetetaan");
                break;
            default:
                System.out.println("En tunnista valintaa");
                break;
        }
    }
}

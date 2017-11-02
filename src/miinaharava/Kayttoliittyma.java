package miinaharava;

import java.util.Scanner;

/**
 * @author Pauli Vähäkangas
 */
public class Kayttoliittyma {
    private Scanner scanner;
        
    public Kayttoliittyma() {
        this.scanner = new Scanner(System.in);
                
    }
    
    public void tulostaValikko() {
        System.out.println("Pelaa   (1)");
        System.out.println("Poistu  (2)");
    }
    
    public int kysyValinta() {
        System.out.print("> ");
        int valinta = scanner.nextInt();
        return valinta;
    }
}

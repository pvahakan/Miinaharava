package miinaharava;

/**
 * @author Pauli Vähäkangas
 */
public class Ruutu {
    /**
     * Onko ruudussa miina
     */
    private boolean onMiina, onAuki, onLippu;
    
    /**
     * Ruudun sijainti pelilaudalla
     */
    private int x, y;
    
    public Ruutu(int x, int y) {
        this.x = x;
        this.y = y;
        this.onMiina = false;
        this.onAuki = false;
        this.onLippu = false;
    }
    
    public void setMiina() {
        this.onMiina = true;
    }
    
    public void setRuutuAuki() {
        this.onAuki = true;
    }
    
    public void setLippu() {
        this.onLippu = true;
    }
    
    public boolean getMiina() {
        return this.onMiina;
    }
    
    public boolean getAvaus() {
        return this.onAuki;
    }
    
    public boolean getLippu() {
        return this.onLippu;
    }
    
    public void tulostaRuutu() {
        System.out.println("Ruutu: (" + this.x + ", " + this.y + ")");
        System.out.println("Auki: " + this.onAuki);
        System.out.println("Lippu: " + this.onLippu);
        System.out.println("Miina: " + this.onMiina);
        System.out.println("");
    }
}


package buscaminas;

/**
 *
 * @author marcos
 */
public class Casilla {
    private boolean mina;
    private boolean blanco;
    private boolean bandera;
    private boolean visible;
    private int numero;

    public Casilla(boolean mina, boolean blanco, boolean bandera, boolean visible, int numero) {
        this.mina = mina;
        this.blanco = blanco;
        this.bandera = bandera;
        this.visible = visible;
        this.numero = numero;
    }

    Casilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isMina() {
        return mina;
    }

    public void setMina(boolean mira) {
        this.mina = mina;
    }

    public boolean isBlanco() {
        return blanco;
    }

    public void setBlanco(boolean blanco) {
        this.blanco = blanco;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
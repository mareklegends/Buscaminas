
package buscaminas;

/**
 *
 * @author marcos
 */
public class Casilla {
    private boolean mira;
    private boolean blanco;
    private boolean bandera;
    private boolean visible;
    private int numero;

    public Casilla(boolean mira, boolean blanco, boolean bandera, boolean visible, int numero) {
        this.mira = mira;
        this.blanco = blanco;
        this.bandera = bandera;
        this.visible = visible;
        this.numero = numero;
    }

    public boolean isMira() {
        return mira;
    }

    public void setMira(boolean mira) {
        this.mira = mira;
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
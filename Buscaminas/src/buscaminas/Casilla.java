
package buscaminas;

/**
 *
 * @author marcos
 * @version 1.0
 * 
 */
public class Casilla {
    private boolean mina;
    private boolean blanco;
    private boolean bandera;
    private boolean visible;
    private int numero;    

    /**
     *
     * @param mina
     * @param blanco
     * @param bandera
     * @param visible
     * @param numero
     */
    public Casilla(boolean mina, boolean blanco, boolean bandera, boolean visible, int numero) {
        this.mina = mina;
        this.blanco = blanco;
        this.bandera = bandera;
        this.visible = visible;
        this.numero = numero;
    }
    /**
     * Constructor por defecto, inicializa los atributos
     */
    public Casilla() {
        this.mina = false;
        this.blanco = true;
        this.bandera = false;
        this.visible = false;
        this.numero = 0;
    }
    
    public String imprimirPrueba(){
        String datos="";
        
      
        
        if (bandera==true) {
             //return "B";
             return "🏳";
        }
        if (numero>0) {
            return Integer.toHexString(numero);
        }
        if (mina==true) {
            //return ="M";
            return "◕";
        }
        if (blanco==true) {
            datos+="-";
        }
        
        return datos;
    }
    
/**
 * Método que devuelve si una casilla tiene una mina o no
 * @return boolean mina: si la casilla es mina true, false si es contrario
 */
    public boolean isMina() {
        return mina;
    }

    @Override
    public String toString() {
        return "";
    }
    
    
    
/** 
 * @param mira 
 */
    public void setMina(boolean mina) {
        this.mina = mina;
    }

    /**
     *
     * @return
     */
    public boolean isBlanco() {
        return blanco;
    }

    /**
     *
     * @param blanco
     */
    public void setBlanco(boolean blanco) {
        this.blanco = blanco;
    }

    /**
     *
     * @return
     */
    public boolean isBandera() {
        return bandera;
    }

    /**
     *
     * @param bandera
     */
    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    /**
     *
     * @return
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     *
     * @param visible
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    /**
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    /**
     *
     * @param numero
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}


package buscaminas;

import java.util.Random;

/**
 *
 * @author marcos
 */
public class Tablero {
    private int numFilas;
    private int numColumnas;
    private int numMinas;
    private Casilla[][] tabla;

    /**
     *
     * @param numFilas
     * @param numColumnas
     */
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = 0;
        this.tabla = new Casilla[numFilas][numColumnas];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = new Casilla();
            }
        }
    }
    
    /**
     *
     * @param nMinas
     */
    public void insetarMinas(int nMinas){
        
        for (int i = 0; i < getTabla().length; i++) {
            for (int j = 0; j < getTabla()[i].length; j++) {
                getTabla()[i][j] = new Casilla();
            }
        }
        
        
        Random r = new Random();
        for (int i = 0; i < nMinas; i++) {
            int fila = r.nextInt(this.numFilas);
            int columna = r.nextInt(this.numColumnas);
            
            if (!tabla[fila][columna].isMina()) {
                getTabla()[fila][columna].setMina(true);
            } else {
                i--;
            }
            
        }
    } 
     
    /**
     *
     */
    public void imprimirPrueba(){
          
        
    }

    /**
     *
     * @param fila
     * @param columna
     * @return
     */
    public int calculaNumMinasCasilla(int fila, int columna){
        int total = 0;
        
        for (int i = (fila - 1); i <= (fila + 1); i++) {
            if (i >= 0 && i < getNumFilas()) {
                for (int j = (columna - 1); j <= (columna + 1); j++) {
                    if (j >= 0 && j < getNumColumnas()) {
                        if (getTabla()[i][j].isMina()) {
                            total++;
                        }
                    }
                }
            }

        }
        
        return total; 
    }

    /**
     *
     * @param fila
     * @param columna
     * @return
     */
    public  Casilla getCasilla(int fila, int columna){
       
        
        
        return null;        
    }
    
    /**
     *
     */
    public  void calcularTablero(){
        
    }

    /**
     *
     * @return
     */
    public int getNumFilas() {
        return numFilas;
    }

    /**
     *
     * @param numFilas
     */
    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    /**
     *
     * @return
     */
    public int getNumColumnas() {
        return numColumnas;
    }

    /**
     *
     * @param numColumnas
     */
    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    /**
     *
     * @return
     */
    public int getNumMinas() {
        return numMinas;
    }

    /**
     *
     * @param numMinas
     */
    public void setNumMinas(int numMinas) {
        this.numMinas = numMinas;
    }

    /**
     *
     * @return
     */
    public Casilla[][] getTabla() {
        return tabla;
    }

    /**
     *
     * @param tabla
     */
    public void setTabla(Casilla[][] tabla) {
        this.tabla = tabla;
    }
    
    
    
}

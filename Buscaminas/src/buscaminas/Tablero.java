
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

    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = 0;
        this.tabla = new Casilla[numFilas][numColumnas];
    }
    
    
     
    
    public static void imprimirPrueba(){
     
    }

    public static int calculaNumMinasCasilla(int fila, int salida){
        int total = 0;
        
        return total; 
    }

    public static Casilla getCasilla(int fila, int columna){
       
        
        
        return null;        
    }
    
    public static void calcularTablero(){
        
    }

    public int getNumFilas() {
        return numFilas;
    }

    public void setNumFilas(int numFilas) {
        this.numFilas = numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public void setNumColumnas(int numColumnas) {
        this.numColumnas = numColumnas;
    }

    public int getNumMinas() {
        return numMinas;
    }

    public void setNumMinas(int numMinas) {
        this.numMinas = numMinas;
    }

    public Casilla[][] getTabla() {
        return tabla;
    }

    public void setTabla(Casilla[][] tabla) {
        this.tabla = tabla;
    }
    
    
    
}


package buscaminas;

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
    
    
    
}

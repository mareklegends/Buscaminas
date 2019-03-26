

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
     * Constructor que inicializa la tabla
     * @param numFilas número de filas del tablero
     * @param numColumnas número de columnas del tablero
     */
    public Tablero(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;
        this.numMinas = 0;
        this.tabla = new Casilla[numFilas][numColumnas];
        
        for (int i = 0; i < this.numFilas; i++) {
            for (int j = 0; j < this.numColumnas; j++) {
                tabla[i][j] = new Casilla();
            }
        }
    }
    
    /**
     * Constructor que rellena el tablero de minas     * 
     * @param nMinas
     */
    public void insetarMinas(int nMinas){       
       
        this.numMinas= nMinas;        
      
        int fila, columna;
        
        for (int i = 0; i < nMinas; i++) {   
              Random r = new Random();
            fila = r.nextInt(this.numFilas);
            columna = r.nextInt(this.numColumnas);
            
            if (!tabla[fila][columna].isMina()) {
                tabla[fila][columna].setMina(true);
            } else {
                i--;
            }
            
        }
    } 
     
    /**
     * Imprime el tablero 
     */
    public void imprimirPrueba(){
        
        int contador = 0;
        System.out.println("B U S C A M I N A S");
        System.out.println("___________________ ___________________");
          System.out.print("    ");
        for (int i = 0; i < this.numColumnas; i++) {
             
            System.out.print(i);
            System.out.print(" ");
            
        }
          System.out.println("");
          
          
          
          for (int i = 0; i < this.numFilas; i++) {
                System.out.print(i+" "+"| ");
              for (int j = 0; j < this.numColumnas; j++) {
                  
                  System.out.print(tabla[i][j].imprimirPrueba() +" ");
              }
                 System.out.print("| "+i+" ");
              System.out.println("");
              
        }
          
              System.out.print("    ");
        for (int i = 0; i < this.numColumnas; i++) {
             
            System.out.print(i);
            System.out.print(" ");
            
        }
          System.out.println(" ");
           System.out.println("___________________ ___________________");
        
    }

    /**
     * Calcula la cantidad de minas que tiene al lado  
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

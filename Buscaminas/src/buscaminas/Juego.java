
package buscaminas;

import java.util.Scanner;

/**
 *
 * @author marcos
 */
public class Juego {
    private Tablero tablero;
    private int numMinas;
    private int numFilas;
    private int numColumnas;    

    /**
     *
     */
    public Juego() {
        this.numFilas = 0;
        this.numColumnas = 0;
        this.numMinas = 0;
        this.tablero= null;
    }
    
    /**
     *
     */
    public void configurarJuego(){
        Scanner leerFilas = new Scanner(System.in);
        Scanner leerColumnas = new Scanner(System.in);
        Scanner leerMinas = new Scanner(System.in);
         System.out.println("______________________________________");
        System.out.println("Buscaminas");
         System.out.println("______________________________________");
        
        System.out.println(">> Dime las filas");
        this.numFilas = leerFilas.nextInt();
         System.out.println("______________________________________");
        System.out.println(">> Dime las columnas");
        this.numColumnas = leerColumnas.nextInt();
         System.out.println("______________________________________");
        System.out.println(">> Dime las minas");
        this.numMinas = leerMinas.nextInt();      
         System.out.println("______________________________________");
        
        
    }
    
    /**
     *
     */
    public void iniciarJuego(){
        this.tablero = new Tablero(numFilas, numColumnas);
        tablero.insetarMinas(numMinas);
        tablero.calcularTablero();
    }
    
    /**
     *
     */
    public void Jugar(){
        
    }
    
    private void mostrarTablero(){
        tablero.imprimirPrueba();
        
    }
    
    private int elegirOperacion(){
        int opc=0;
        
        return opc;
    } 
    private boolean cordenadasCorrectas(int fila, int columna){
        boolean acierto = false;
        
        return acierto;
    }
    
    private void acabarjuegoMina(){
        System.out.println("Juego finalizado has pisado una mina");
        
        //falta imprimir la solucion
    }
    
    private boolean descubrirCasilla(int fila, int columna){
         boolean acierto = false;
        
        return acierto;
    }
    
    private boolean descubrirBlanco(int fila, int columna){
         boolean acierto = false;
        
        return acierto;
    }
    private boolean PartidaGanada(){
          boolean fin = false;
        
        return fin;
    }
    
}

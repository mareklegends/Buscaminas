
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

    public Juego() {
        
    }
    
    public void configurarJuego(){
        Scanner leerFilas = new Scanner(System.in);
        Scanner leerColumnas = new Scanner(System.in);
        Scanner leerMinas = new Scanner(System.in);
        
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("Buscaminas");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        
        System.out.println("Dime las filas");
        int filas = leerFilas.nextInt();
        System.out.println("Dime las columnas");
        int columnas = leerColumnas.nextInt();
        System.out.println("Dime las minas");
        int minas = leerMinas.nextInt();      
        
        
    }
    
    public void iniciarJuego(){
        
    }
    
    public void Jugar(){
        
    }
    
    private void mostrarTablero(){
        
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

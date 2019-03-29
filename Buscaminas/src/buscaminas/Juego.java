
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
        
        configurarJuego();
        iniciarJuego();
        
        boolean bandera = false;
        
        while (bandera!=true) {            
        
        switch(elegirOperacion()){
            case 1:
                System.out.println("Descubirir casilla");
                System.out.println("______________________________________");
                
                break;
            case 2:
                System.out.println("Descubrir blanco");
                System.out.println("______________________________________");
                
                break;
                   
        }
            
       }
        
        
        
    }
    
    private void mostrarTablero(){
        tablero.imprimirPrueba();
        
    }
    
    private int elegirOperacion(){
        
        Scanner leer = new Scanner(System.in);
        
        int opc=7;
        
        System.out.println(">>>>>>-----");
        System.out.println("1. Descubirir casilla");
        System.out.println("2. Descubrir blanco");
        System.out.println("-----<<<<<<");
        
        while(opc!=1 || opc!=2){
        System.out.println("Dime una opción");
        opc=leer.nextInt();
        System.out.println("______________________________________");
        }
        
        return opc;
    } 
    private boolean cordenadasCorrectas(int fila, int columna){
        boolean acierto = false;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (fila>=0 && columna>=0) {
                    if (fila <= numFilas && columna <= numColumnas) {
                        acierto=true;
                    }
                }
            }
        }
        
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

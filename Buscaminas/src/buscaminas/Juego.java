
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
        
    boolean repeticion = true;
        mostrarTablero();
        System.out.println("");
        while (repeticion == true) {
            Scanner leer = new Scanner(System.in);
            int fila = 0;
            int columna = 0;
            int numero = elegirOperacion();
            switch (numero) {
                case 1:

                    System.out.print(" - Fila:");
                    fila = leer.nextInt();
                    System.out.print(" - Columna:");
                    columna = leer.nextInt();
                    if (descubrirCasilla(fila, columna) == 1) {
                        acabarjuegoMina();
                        repeticion = false;
                    }
                    if (descubrirCasilla(fila, columna) == 2) {
                        descubrirBlanco(fila, columna);
                        mostrarTablero();
                    }
                    if (descubrirCasilla(fila, columna) == 3) {
                        System.out.println("La posición no es válida.");
                        mostrarTablero();
                    }
                    if (PartidaGanada()) {
                        repeticion = false;
                    }
                    break;
                case 2:
                    System.out.print(" >>> Fila:");
                    fila = leer.nextInt();
                    System.out.print(" >>> Columna:");
                    columna = leer.nextInt();
                    if (cordenadasCorrectas(fila, columna) == true) {
                        tablero.getCasilla(fila, columna).setVisible(true);
                        tablero.getCasilla(fila, columna).setBandera(true);
                        if (PartidaGanada()) {
                            repeticion = false;
                        }
                    } else {
                        System.out.println("La posición no es válida.");
                    }
                    break;
                case 3:
                    System.out.print("   -> Fila:");
                    fila = leer.nextInt();
                    System.out.print("   -> Columna:");
                    columna = leer.nextInt();
                    if (cordenadasCorrectas(fila, columna) == true && tablero.getCasilla(fila, columna).isBandera()) {
                        tablero.getCasilla(fila, columna).setBandera(false);
                        tablero.getCasilla(fila, columna).setVisible(false);
                    } else {
                        System.out.println("La posición no es válida.");
                    }
                    break;
                case 4:
                    acabarjuegoMina();
                    repeticion = false;
                    break;
            }
        }
        
        
    }
    
    private void mostrarTablero(){
        tablero.imprimirPrueba();
        
    }
    
    private int elegirOperacion(){
        
        Scanner op = new Scanner(System.in);
        int opc = 0;

        while (opc <= 0 || opc > 4) {
            System.out.println("-------------------------------");
            System.out.println("  1 - Descubrir casilla");
            System.out.println("  2 - Poner bandera");
            System.out.println("  3 - Quitar bendera");
            System.out.println("  4 - Retirarse");
            System.out.println("-------------------------------");
            System.out.print("  -> ");
            opc = op.nextInt();
        }

        return opc;
    } 
    private boolean cordenadasCorrectas(int fila, int columna){
        boolean acierto = false;
        if (fila >= 0 && fila < numFilas && columna >= 0 && columna < numColumnas && !tablero.getCasilla(fila, columna).isVisible()) {
            acierto = true;
        }
        return acierto;
    }
    
    private void acabarjuegoMina(){        
        
        System.out.println("Juego finalizado has pisado una mina. \nSolución de la partida:");
        //tablero.calcularTablero();
        tablero.imprimirPrueba();
    }
    
    private int descubrirCasilla(int fila, int columna){
           if (cordenadasCorrectas(fila, columna) == true) {
            if (tablero.getCasilla(fila, columna).isMina()) {
                return 1;
            } else {
                return 2;
            }
        } else {
            return 3;
        }
    }
    
    private void descubrirBlanco(int fila, int columna){
          tablero.getCasilla(fila, columna).setVisible(true);
        if (tablero.calculaNumMinasCasilla(fila, columna) == 0) {
           tablero.getCasilla(fila, columna).setBlanco(true);
            for (int i = (fila - 1); i < (fila + 1); i++) {
                for (int j = (columna - 1); j < (columna + 1); j++) {
                    if (cordenadasCorrectas(i, j)) {
                        descubrirBlanco(i, j);
                    }
                }
            }
        }
    
    }
    private boolean PartidaGanada(){
           int contador = 0;
        int total = tablero.getNumFilas() * tablero.getNumColumnas();
        for (int i = 0; i < tablero.getTabla().length; i++) {
            for (int j = 0; j < tablero.getTabla()[i].length; j++) {
                if (tablero.getCasilla(i, j).isVisible()) {
                    contador++;
                }
            }
        }

        if (contador == total) {
            return true;
        }
        return false;
    }
    
}

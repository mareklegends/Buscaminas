/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

/**
 *
 * @author marcos
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Juego j = new Juego();
        j.configurarJuego();
        j.iniciarJuego();
        /*
        Tablero t = new Tablero(9, 9);
        t.insetarMinas(5);
        //t.imprimirPrueba();
        t.calcularTablero();
        t.imprimirPrueba();
*/
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author jamsr
 */
public class DoWhile {

    public static void main(String[] args) {

        int contador = 3;
        // SINTAXIS
        // do{
        // Sentencias a repetir; 
        // } while (condicion a evaluar boolean);
        // Termina do while

        do {
            System.out.println("contador = " + contador);
            contador++; // Primero ejecutara el bloque de código y después evaluará la condición
        } while (contador < 3); // Esto significa que al menos una vez se ejecutará el código

        // Si el valor de la variable contador es 3, se ejecutará una sola vez
        // Si es 0 se ejecutará 3 veces, similar a while
    }

}

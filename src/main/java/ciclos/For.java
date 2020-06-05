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
public class For {

    public static void main(String[] args) {
        // SINTAXIS
        // for (inicialización ; condicion a evaluar boolean ; iteración) {
        // for (definir variable; condicion a evaluar ; incremento o decremento) {
        // cuerpo loop
        // }

        for (int i = 0; i < 3; i++) { // Tiene más estructura y control el bloque desde un inicio
            // Podemos escribir for y tab para que se agregue la estructura
            System.out.println("i = " + i);// También se puede hacer un ciclo infinito si no definimos bien la estructura
        } // Termina for cuando se pasa de true a false
        
        }

}

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
public class While {

    public static void main(String[] args) {

        int contador = 0; //Ésta variable nos ayuda a detener nuestro programa si llega a cierta condición, su valor inicia en 0
        // SINTAXIS 
        // while (condicion boolean){
        // cuerpo de bloque a repetir
        // } (termina while y continúa el programa)

        while (contador < 3) { // Este ciclo se ejecutará siempre y cuando el contador sea menor a 3 
            System.out.println("contador = " + contador); // Imprimirá de 0 a 2
            // Dentro del ciclo, incrementaremos el valor del contador para q cada vez que se ejecute el ciclo, se incremente en uno el valor del contador
            contador++; // si no incrementamos el valor del contador, nunca se modificará la variable y será un ciclo infinito
            // Así cada vez que se revise, irá incrementando en uno hasta que llegue a 3 y pase de true a false
            // Se ejecutará el ciclo 3 veces y se detendrá la ejecución de while
            
            // Si el valor de contador es 3, ya no se ejecuta el bloque de código.
        }

    }

}

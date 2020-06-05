package ciclos;

public class BreakYContinue {

    public static void main(String[] args) {

        // Break para romper la ejecución del ciclo while, do while, for, switch:
        for (int a = 0; a < 3; a++) {
            System.out.println("a = " + a);
            break; // Rompe el ciclo y sólo se imprime el primer valor
        }

        // Break también se usa para evaluar condiciones dentro del ciclo:
        for (int b = 0; b < 3; b++) {
            // Imprimir sólo números pares:
            if (b % 2 == 0) {
                System.out.println("b = " + b); // No imprime el 1, sólo imprimiría el valor 0 y 2
                break; // Si agregamos break sólo imprimirá el PRIMER numero PAR q encuentre = 0, porque se rompe el ciclo
            }
        }

        // CONTINUE: 
        // No significa que continua nuestro programa, significa que dentro del ciclo continua ejecutando la siguiente 
        // iteración y todas las lineas que estén posterior a continue ya NO SE VAN A EJECUTAR
        for (int c = 0; c < 3; c++) {
            // Imprimir numeros pares:
            if (c % 2 != 0) { // Si el número es impar, entonces NO SE IMPRIME y continua el ciclo for
                continue; // Como la expresion es false, NO entra en CONTINUE y salta a imprimir la variable c
                // Continua ejecutando la SIGUIENTE ITERACION del ciclo for, NO las siuientes lineas despues de continue
            }
            System.out.println("c = " + c); // Por lo tanto imprimirá números pares 0 y 2
        }

        // USO DE LABELS
        // Podemos usar etiquetas para definir mejor nuestro inicio de código:
        // Se pueden usar con break o continue
        
        inicio: // Se pone antes del ciclo para saber cual va a afectar
        for (int d = 0; d < 3; d++) {
            //Imprimir pares:
            if (d % 2 != 0) {
             // Usamos el mismo ejemplo de continue
                continue inicio; // Aqui es mas claro el uso de continue, vemos dónde va a continuar el codigo si es false (par)
            }
            System.out.println("d = " + d); 
            
        }
    }

}

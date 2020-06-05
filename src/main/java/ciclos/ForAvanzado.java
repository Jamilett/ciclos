package ciclos;

public class ForAvanzado {

    public static void main(String[] args) {

        String[] listaNombres = {"Jamilett", "Andres", "Jesus"};

        for (String nombre : listaNombres) {
            System.out.println("Nombre: " + nombre);
        }

        int[] listaCalificaciones = {8, 9, 10};

        for (int calificacion : listaCalificaciones) {
            System.out.println("Calificacion: " + calificacion);
        }

        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Contador: " + i);
            System.out.println("Nombre: " + listaNombres[i]);
        }

    }

}

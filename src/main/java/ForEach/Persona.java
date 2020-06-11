package ForEach;

/**
 * Esta clase contiene atributos y metodos para crear arreglos y objetos de tipo
 * Persona
 *
 * @author jamsr
 */
public class Persona {

    private final int idPersona;
    private String nombre;
    private static int contadorPersonas;

    /**
     * Constructor con un argumento de tipo String que inicializa el atributo
     * nombre y el contador de idPersona
     *
     * @param nombre
     */
    public Persona(String nombre) {
        this.idPersona = ++contadorPersonas;
        this.nombre = nombre;
    }

    /**
     * Metodo que obtiene el atributo nombre de la clase Persona
     *
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que asigna un nuevo valor String al atributo nombre de la clase
     * Persona
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo que permite imprimir los VALORES de cada objeto creado y no solo
     * la referencia en memoria
     *
     * @return
     */
    @Override
    public String toString() { // Si no agregamos toString se imprimira solamente la referencia en memoria
        return "Persona{ " + "idPersona--> " + idPersona + " --> nombre: " + nombre + '}';
    }

}

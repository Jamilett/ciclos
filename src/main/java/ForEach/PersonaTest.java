package ForEach;

/**
 * Esta clase contiene metodo main para crear arreglo de tipo Persona e iterarlo
 * mediante ciclo forEach
 *
 * @author jamsr
 */
public class PersonaTest {

    public static void main(String[] args) {

        Persona[] personas = {new Persona("Andy"), new Persona("Jam")};

        for (Persona persona : personas) {
            System.out.println(persona);
        }

    }

}

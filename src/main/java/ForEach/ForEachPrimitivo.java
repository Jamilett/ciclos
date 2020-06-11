package ForEach;

/**
 *
 * @author jamsr
 */
public class ForEachPrimitivo {

    public static void main(String[] args) {
        int edades[] = {15, 20, 41, 50};
        
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }
    }

}

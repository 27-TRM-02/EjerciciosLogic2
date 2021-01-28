
package ejercicioslogic2tomasrodriguez;

/*******************************************************************************
 * @author trm == Tomás Rodríguez - Mata Suárez - UFV Cetys
 * *****************************************************************************
 * Ejercicios Java de CodingBat Logic-2
 */
public class EjerciciosLogic2TomasRodriguez {
    /**
     * Ejercicio1 makeBricks
     * Medidas de los ladrillos: small (1 de ancho) ; big (5 de ancho))
     * Si con los ladrillos dados, se puede llegar alcanzar el ancho requerido
     * por goal, el método devuelve TRUE; sino devuelve FALSE
     * *************************************************************************
     * @param small
     * @param big
     * @param goal
     * @return 
     */
    public boolean makeBricks(int small, int big, int goal) {
        return ((big * 5) + small < goal) ? false : (goal % 5 > small) ? false : true;
    }
    
    /**
     * Ejercicio 2 loneSum
     * Método que devuelve la suma de los 3 enteros que se le pasa por 
     * parámetro; excepto si todos o alguno de ellos es igual entre sí,
     * lo cual, dichos numeros que fuesen iguales, NO SE SUMAN.
     * *************************************************************************
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int loneSum(int a, int b, int c) {
        return (a == b && b == c) ? 0 : (a == b) ? c : (b == c) ? a : (a == c) ? b : a + b + c;
   }

    /**
     * Ejercicio 3 luckySum
     * Devuelve la suma de los enteros pasados por parámetros, excepto cuando,
     * uno de los valores sea 13, en ese caso no se sequirá sumando, y se quedará
     * con la suma que se llevaba ( de izda. a dcha. )
     * *************************************************************************
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int luckySum(int a, int b, int c) {
        return (a == 13) ? 0 : (b == 13) ? a : (c == 13) ? a + b : a + b + c;
    }
    
    public static void main(String[] args) {
        // creamos objeto de esta clase (Ejercicios basicosJava)
        EjerciciosLogic2TomasRodriguez ejercicio = new EjerciciosLogic2TomasRodriguez(); 
        // Salida por la terminal de los resultados de los ejercicios
        // Ejercicio1 makeBricks
        System.out.println(ejercicio.makeBricks(3, 1, 8));
        System.out.println(ejercicio.makeBricks(3, 1, 9));
        System.out.println(ejercicio.makeBricks(3, 2, 10));
        System.out.println(ejercicio.makeBricks(1, 4, 12));
        System.out.println(ejercicio.makeBricks(2, 20, 98));
        // Ejercicio2 loneSum
        // Ejercicio3
        // Ejercicio4
        // Ejercicio5
        // Ejercicio6
        // Ejercicio7
        // Ejercicio8
        // Ejercicio9
        
    }
}

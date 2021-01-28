
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
    
    /**
     * Ejercicio 4 noTeenSum
     * Devuelve la suma de los 3 enteros pasados por parámetro
     * Si alguno de los números, está comprendido entre 13 y 19, salvo el
     * 15 y el 16, ese número será = 0
     * *************************************************************************
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int noTeenSum(int a, int b, int c) {
        if (a != 15 && a != 16 && a >= 13 && a <= 19){
          a = 0;
        }
        if (b != 15 && b != 16 && b >= 13 && b <= 19){
          b = 0;
        }
        if (c != 15 && c != 16 && c >= 13 && c <= 19){
          c = 0;
        }
        return a + b + c;
    }

    /************************************MAIN***********************************
     * 
     * @param args 
     */
    public static void main(String[] args) {
        // creamos objeto de esta clase 
        EjerciciosLogic2TomasRodriguez logic2 = new EjerciciosLogic2TomasRodriguez(); 
    }
}

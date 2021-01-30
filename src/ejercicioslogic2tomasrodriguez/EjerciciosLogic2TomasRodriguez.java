
package ejercicioslogic2tomasrodriguez;

/**
 * @author trm == Tomás Rodríguez - Mata Suárez - UFV Cetys
 * *****************************************************************************
 * Ejercicios Java de CodingBat Logic-2
 */
public class EjerciciosLogic2TomasRodriguez {
    /**
     * Ejercicio1 makeBricks
     * *************************************************************************
     * Medidas de los ladrillos: small (1 de ancho) ; big (5 de ancho))
     * Si con los ladrillos dados, se puede llegar alcanzar el ancho requerido
     * por goal, el método devuelve TRUE; sino devuelve FALSE
     * 
     * @param small
     * @param big
     * @param goal
     * @return 
     */
    public boolean makeBricks(int small, int big, int goal) {
        return ((big * 5) + small < goal) ? false : (goal % 5 > small) ? false : true;
    }
    
    /**
     * Ejercicio2 loneSum
     * *************************************************************************
     * Método que devuelve la suma de los 3 enteros que se le pasa por 
     * parámetro; excepto si todos o alguno de ellos es igual entre sí,
     * lo cual, dichos numeros que fuesen iguales, NO SE SUMAN.
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int loneSum(int a, int b, int c) {
        return (a == b && b == c) ? 0 : (a == b) ? c : (b == c) ? a : (a == c) ? b : a + b + c;
   }

    /**
     * Ejercicio3 luckySum
     * *************************************************************************
     * Devuelve la suma de los enteros pasados por parámetros, excepto cuando,
     * uno de los valores sea 13, en ese caso no se sequirá sumando, y se
     * quedará con la suma que se llevaba ( de izda. a dcha. )
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int luckySum(int a, int b, int c) {
        return (a == 13) ? 0 : (b == 13) ? a : (c == 13) ? a + b : a + b + c;
    }
    
    /**
     * Ejercicio4 noTeenSum
     * *************************************************************************
     * Devuelve la suma de los 3 enteros pasados por parámetro
     * Si alguno de los números, está comprendido entre 13 y 19, salvo el
     * 15 y el 16, ese número será = 0
     * 
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
    
    /**
     * Ejercicio5 roundSum
     * *************************************************************************
     * Método devuelve la suma de los 3 enteros pasados por parámetro
     * A esos 3 enteros, se les aplica un redondeo a múltiplos de 10
     * Hacia arriba: si la cifra más a la dcha es >= a 5
     * Hacia abajo: si la cifra mas a la dcha es < 5
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public int roundSum(int a, int b, int c) {
        if (a % 10 >= 5){
          while (a % 10 != 0){
            a += 1;
          }
        } else {
          while (a % 10 != 0){
            a -= 1;
          }
        }
        if (b % 10 >= 5){
          while (b % 10 != 0){
            b += 1;
          }
        } else {
          while (b % 10 != 0){
            b -= 1;
          }
        }
        if (c % 10 >= 5){
          while (c % 10 != 0){
            c += 1;
          }
        } else {
          while (c % 10 != 0){
            c -= 1;
          }
        }

        return a + b + c;
      }
    
    /**
     * Ejercicio6 closeFar
     * *************************************************************************
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean closeFar(int a, int b, int c) {
        return Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2 ? true : Math.abs(c - a) <= 1 && Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2? true : false;
      }
    
    /**
     * Ejercicio7 blackjack
     * *************************************************************************
     * 
     * @param a
     * @param b
     * @return 
     */
    public int blackjack(int a, int b) {
        return (a <= 21 && a != 0 && (b > 21 || a >= b)) ? a : (b <= 21 && b != 0 && (a > 21 || a <= b)) ? b : 0;
      }

    /**
     * Ejercicio8 evenlySpaced
     * *************************************************************************
     * 
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean evenlySpaced(int a, int b, int c) {
        return Math.abs(a - b) == Math.abs(a - c) && (b < c || b > c) ? true : Math.abs(b - a) == Math.abs(b - c) && (a < c || a > c) ? true : Math.abs(c - a) == Math.abs(c - b) && (b < a || b > a) ? true : (a == b && b == c) ? true : false; 
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

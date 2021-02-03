
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
        return ((big * 5) + small < goal) || (goal % 5 > small) ? false : true;
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
     * uno de los valores sea 13, en ese caso no se seguirá sumando, y se
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
        // comprueba si a tiene que ser 0
        if (a != 15 && a != 16 && a >= 13 && a <= 19){
          a = 0;
        }
        // comprueba si b tiene que ser 0
        if (b != 15 && b != 16 && b >= 13 && b <= 19){
          b = 0;
        }
        // comprueba si c tiene que ser 0
        if (c != 15 && c != 16 && c >= 13 && c <= 19){
          c = 0;
        }
        // devuelve la suma entre los 3 argumentos.
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
        // redondea a
        if (a % 10 >= 5){
          while (a % 10 != 0){
            a += 1;
          }
        } else {
          while (a % 10 != 0){
            a -= 1;
          }
        }
        // redondea b
        if (b % 10 >= 5){
          while (b % 10 != 0){
            b += 1;
          }
        } else {
          while (b % 10 != 0){
            b -= 1;
          }
        }
        // redondea c
        if (c % 10 >= 5){
          while (c % 10 != 0){
            c += 1;
          }
        } else {
          while (c % 10 != 0){
            c -= 1;
          }
        }
        // devuelve la suma
        return a + b + c;
      }
    
    /**
     * Ejercicio6 closeFar
     * *************************************************************************
     * Si "b" y "c" tienen una diferencia de 2 o mas, y alguno de ellos está a 
     * 1 o menos de "a", mientras que el otro está a 2 o mas de "a", devuelve
     * true, sino devuelve false.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(b - a) <= 1 && Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2) || (Math.abs(c - a) <= 1 && Math.abs(b - a) >= 2 && Math.abs(c - b) >= 2);
     }
    
    /**
     * Ejercicio7 blackjack
     * *************************************************************************
     * Devuelve el numero pasado por parametro, que este mas cerca o sea 21.
     * Si los dos argumentos son mayores que 21, devuelve 0
     * @param a
     * @param b
     * @return 
     */
    public int blackjack(int a, int b) {
        return (a <= 21 && (b > 21 || a >= b)) ? a : (b <= 21 && (a > 21 || a <= b)) ? b : 0;
     }


    /**
     * Ejercicio8 evenlySpaced
     * *************************************************************************
     * Si un argumento, esta a la misma distancia que los otros 2 argumentos, o
     * todos son iguales, devuelve true, sino false.
     * @param a
     * @param b
     * @param c
     * @return 
     */
    public boolean evenlySpaced(int a, int b, int c) {
        // checkea si "a" esta a la misma diferencia entre los otros 2
        if (Math.abs(a - b) == Math.abs(a - c) && (b < c || b > c)) {
          return true;
        }
        // checkea si "b" esta a la misma diferencia entre los otros 2

        if (Math.abs(b - c) == Math.abs(b - a) && (a < c || a > c)) {
          return true;
        }
        // checkea si "c" esta a la misma diferencia entre los otros 2
        if (Math.abs(c - b) == Math.abs(c - a) && (b < a || b > a)) {
          return true;
        }
        // checkea si son todos iguales
        if (a == b && b == c) {
          return true;
        }
        return false;

     }

    /**
     * Ejercicio9 makeChocolate
     * *************************************************************************
     * Tenemos tabletas de chocolate small(1kg cada) y las big(5kg cada)
     * Se nos marca un goal. Dicho goal en kg, tiene que poder cumplirse con
     * las tabletas que nos hayan pasado por parámetro; sino se puedo lograr
     * el goal, devuelve -1.
     * Primero utilizaremos todas las big que podamos, y luego las small. El 
     * método devuelve el numero de tabletas small que hemos utilizado para
     * cumplir el goal.
     * @param small
     * @param big
     * @param goal
     * @return 
     */
    public int makeChocolate(int small, int big, int goal) {
        // Kg de las tabletas big pasadas
        int bigKg = big * 5;
        // Cuando Kg de big sean mayor que goal, le quita 1 tableta hasta que sea menor
        while (bigKg > goal) {
          bigKg -= 5;
        }
        // Si utilizamos solo big para realizar goal
        if (bigKg == goal) {
          return 0;
        }
        // Si utilizamos todas las small para realizar goal
        if (small + bigKg == goal) {
          return small;
        }
        // Si no utlizamos todas las small para llegar a goal
        if (small + bigKg >= goal) {
          int used = (small + bigKg) - goal;
          return small - used;
        }
        // Si no se puede realizar el goal
        return -1;
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

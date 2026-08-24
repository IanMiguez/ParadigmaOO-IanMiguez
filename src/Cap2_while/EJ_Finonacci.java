package Cap2_while;

import java.util.Scanner;

public class EJ_Finonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Ingrese cuantos términos de la Fibonacci desea mostrar: ");
        n = sc.nextInt();
        int a = 0, b = 1, c;
        System.out.print("Los primeros " + n + " términos de la serie Fibonacci son: ");
        int i = 1;
        while (i <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}

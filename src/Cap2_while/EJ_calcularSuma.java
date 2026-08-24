package Cap2_while;

import java.util.Scanner;

public class EJ_calcularSuma {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i = 1;
        double suma = 0;
        System.out.print("Ingrese un número entero positivo: ");
        n = sc.nextInt();
        while (n <= 0) {
            System.out.print("Número inválido. Ingrese un número entero positivo: ");
            n = sc.nextInt();
        }
        while (i <= n) {
            suma += (double) 1/i;
            i++;
        }
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}

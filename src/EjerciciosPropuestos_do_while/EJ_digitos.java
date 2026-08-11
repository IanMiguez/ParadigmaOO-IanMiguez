package EjerciciosPropuestos_do_while;

import java.util.Scanner;

public class EJ_digitos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int digit = 0;

        System.out.print("Ingrese un número para ver cuántos dígitos tiene: ");
        n = sc.nextInt();

        do {
            n = n / 10;
            digit++;
        } while (n != 0);

        System.out.println("El número tiene " + digit + " dígitos.");
    }
}

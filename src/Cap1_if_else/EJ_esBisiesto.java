package Cap1_if_else;

import java.util.Scanner;

public class EJ_esBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int año;
        System.out.print("Ingrese un año para verificar si es bisiesto: ");
        año = sc.nextInt();
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}

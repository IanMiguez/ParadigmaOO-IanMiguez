package Cap3_do_while;

import java.util.Locale;
import java.util.Scanner;

public class EJ_notas_mayores_a_3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double nota;
        int cont = 0;
        int i = 0;
        do {
            System.out.print("Ingrese una nota: ");
            nota = sc.nextDouble();
            if (nota >= 3.0){
                cont++;
            }
            i++;
        } while (i<5);
        System.out.println("Notas mayores o iguales a 3.0: "+cont);
    }
}

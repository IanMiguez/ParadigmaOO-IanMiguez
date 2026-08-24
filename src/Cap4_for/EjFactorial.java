package Cap4_for;

public class EjFactorial {
    static void main(String[] args) {
        int n = 10; //Número a calcular
        int factorial = 1;
        for (int i = n; i > 0; i--) {
            factorial*=i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}

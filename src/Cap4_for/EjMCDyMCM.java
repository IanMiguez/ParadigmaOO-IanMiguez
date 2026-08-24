package Cap4_for;

public class EjMCDyMCM {
    public static int calcularMCD(int a, int b) {
        int mcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;
            }
        }
        return mcd;
    }

    static void main(String[] args) {
        int a = 48;
        int b = 18;

        int mcd = calcularMCD(a, b);
        System.out.println("El MCD de " + a + " y " + b +" es: " + mcd);

        // Calcular el MCM usando la relación entre MCD y MCM
        int mcm = (a * b) / mcd;
        System.out.println("El MCM de " + a + " y " + b +" es: " + mcm);

    }
}

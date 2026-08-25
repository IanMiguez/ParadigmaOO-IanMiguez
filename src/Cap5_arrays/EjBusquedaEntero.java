package Cap5_arrays;

public class EjBusquedaEntero {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int elem = 32;
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (elem==array[i]) {
                System.out.println("El elemento " + elem + " se encuentra en la posición " + i);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El elemento " + elem + " no se encuentra en el array");
        }
    }
}

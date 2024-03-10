public class OrdenamientoPorInsercion {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        System.out.println("Array original:");
        imprimirArray(array);

        ordenamientoPorInsercion(array);

        System.out.println("\nArray ordenado:");
        imprimirArray(array);
    }

    static void ordenamientoPorInsercion(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int clave = array[i];
            int j = i - 1;

            // Mover los elementos del array[0..i-1] que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && array[j] > clave) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = clave;
        }
    }

    static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}


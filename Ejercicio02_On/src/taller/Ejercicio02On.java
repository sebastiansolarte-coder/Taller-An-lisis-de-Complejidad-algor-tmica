package taller;

/** Ejercicio de análisis de complejidad: O(n). */
public class Ejercicio02On {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n)
        long suma = 0;
int i = n;
while (i > 0) {
    suma += i;
    i--;
}
System.out.println("Suma: " + suma);
    }

    private static int leerN(String[] args) {
        if (args.length == 0) return 10;
        try {
            int n = Integer.parseInt(args[0]);
            if (n <= 0) throw new NumberFormatException();
            return n;
        } catch (NumberFormatException e) {
            System.err.println("n debe ser un entero positivo.");
            System.exit(1);
            return 10;
        }
    }
}

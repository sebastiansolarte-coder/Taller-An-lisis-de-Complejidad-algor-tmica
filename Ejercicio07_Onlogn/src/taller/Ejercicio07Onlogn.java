package taller;

/** Ejercicio de análisis de complejidad: O(n log n). */
public class Ejercicio07Onlogn {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n log n)
        long total = 0;
for (int i = 0; i < n; i++) {
    long k = 1;
    while (k < n) {
        total++;
        k *= 2;
    }
}
System.out.println("Total: " + total);
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

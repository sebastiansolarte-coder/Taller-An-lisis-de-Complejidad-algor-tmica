package taller;

/** Ejercicio de análisis de complejidad: O(n). */
public class Ejercicio04On {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n)
        long a = 0, b = 0;
for (int i = 0; i < n; i++) a += i;
for (int j = 0; j < n; j++) b += j;
System.out.println("a = " + a + ", b = " + b);
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

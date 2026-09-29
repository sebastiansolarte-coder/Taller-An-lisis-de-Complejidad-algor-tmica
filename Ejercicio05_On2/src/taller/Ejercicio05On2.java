package taller;

/** Ejercicio de análisis de complejidad: O(n^2). */
public class Ejercicio05On2 {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n^2)
        long producto = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) producto *= 2;
}
System.out.println("Producto (puede desbordarse): " + producto);
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

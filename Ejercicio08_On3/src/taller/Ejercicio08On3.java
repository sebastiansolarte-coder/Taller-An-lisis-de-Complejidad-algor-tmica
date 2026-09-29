package taller;

/** Ejercicio de análisis de complejidad: O(n^3). */
public class Ejercicio08On3 {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n^3)
        long contadorOps = 0;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= n; k++) contadorOps++;
    }
}
System.out.println("Operaciones: " + contadorOps);
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

package taller;

/** Ejercicio de análisis de complejidad: O(n^2). */
public class Ejercicio09On2 {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n^2)
        long sumaPares = 0;
for (int i = 0; i < n; i++) {
    for (int j = i; j < n; j++) sumaPares += i + j;
}
System.out.println("Suma: " + sumaPares);
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

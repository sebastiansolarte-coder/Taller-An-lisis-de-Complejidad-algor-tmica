package taller;

/** Ejercicio de análisis de complejidad: O(n). */
public class Ejercicio03On {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(n)
        int contador = 0;
for (int i = 1; i <= n; i += 3) {
    contador++;
}
System.out.println("Iteraciones: " + contador);
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

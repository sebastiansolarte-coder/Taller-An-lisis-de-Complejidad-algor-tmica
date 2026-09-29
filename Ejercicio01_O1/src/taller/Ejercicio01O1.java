package taller;

/** Ejercicio de análisis de complejidad: O(1). */
public class Ejercicio01O1 {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(1)
        long x = n + 10L;
long y = (x * x) / 3;
long resultado = y % 5;
System.out.println("Resultado: " + resultado);
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

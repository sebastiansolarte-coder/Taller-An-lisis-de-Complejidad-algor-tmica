package taller;

/** Ejercicio de análisis de complejidad: O(log n). */
public class Ejercicio10Ologn {
    public static void main(String[] args) {
        int n = leerN(args);
        // Complejidad temporal: O(log n)
        long i = n;
long resultado = 0;
while (i > 1) {
    resultado += i;
    i /= 3;
}
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

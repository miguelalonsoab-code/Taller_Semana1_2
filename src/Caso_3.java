import java.util.Scanner;

class Operacion {

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // NUEVA SOBRECARGA
    public static int sumar(int[] numeros) {

        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }
}

public class Caso_3 {

    public static void mostrarMenu() {

        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║   SOBRECARGA DE MÉTODOS      ║");
        System.out.println("╚══════════════════════════════╝");

        System.out.println("1 → Sumar 2 enteros");
        System.out.println("2 → Sumar 2 decimales");
        System.out.println("3 → Sumar 3 enteros");
        System.out.println("4 → Sumar múltiples números");
        System.out.println("5 → Salir");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            mostrarMenu();

            System.out.print("\nSeleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese primer entero: ");
                    int a = scanner.nextInt();

                    System.out.print("Ingrese segundo entero: ");
                    int b = scanner.nextInt();

                    System.out.println("Resultado = " + Operacion.sumar(a, b));
                    break;

                case 2:

                    System.out.print("Ingrese primer decimal: ");
                    double x = scanner.nextDouble();

                    System.out.print("Ingrese segundo decimal: ");
                    double y = scanner.nextDouble();

                    System.out.println("Resultado = " + Operacion.sumar(x, y));
                    break;

                case 3:

                    System.out.print("Ingrese número 1: ");
                    int n1 = scanner.nextInt();

                    System.out.print("Ingrese número 2: ");
                    int n2 = scanner.nextInt();

                    System.out.print("Ingrese número 3: ");
                    int n3 = scanner.nextInt();

                    System.out.println("Resultado = " + Operacion.sumar(n1, n2, n3));
                    break;

                case 4:

                    System.out.print("¿Cuántos números desea sumar?: ");
                    int cantidad = scanner.nextInt();

                    int[] numeros = new int[cantidad];

                    for (int i = 0; i < cantidad; i++) {

                        System.out.print("Número [" + (i + 1) + "]: ");
                        numeros[i] = scanner.nextInt();
                    }

                    System.out.println("Resultado = " + Operacion.sumar(numeros));
                    break;

                case 5:
                    System.out.println("\nPrograma finalizado.");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
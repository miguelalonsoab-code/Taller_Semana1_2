import java.util.InputMismatchException;
import java.util.Scanner;

public class Caso_1 {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    public static void mostrarMenu() {
        System.out.println("\n╔══════════════════════════╗");
        System.out.println("║    CALCULADORA BÁSICA    ║");
        System.out.println("╚══════════════════════════╝");

        System.out.println("  1 → Suma");
        System.out.println("  2 → Resta");
        System.out.println("  3 → Multiplicación");
        System.out.println("  4 → División");
        System.out.println("  5 → Salir");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            try {

                mostrarMenu();

                System.out.print("\nTu elección: ");
                opcion = scanner.nextInt();

                if (opcion == 5) {
                    System.out.println("\nPrograma finalizado.");
                    break;
                }

                System.out.print("\nIngresa el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                switch (opcion) {

                    case 1:
                        System.out.println("Resultado = " + sumar(num1, num2));
                        break;

                    case 2:
                        System.out.println("Resultado = " + restar(num1, num2));
                        break;

                    case 3:
                        System.out.println("Resultado = " + multiplicar(num1, num2));
                        break;

                    case 4:
                        System.out.println("Resultado = " + dividir(num1, num2));
                        break;

                    default:
                        System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("\nError: Debes ingresar números válidos.");
                scanner.nextLine();

            } catch (ArithmeticException e) {
                System.out.println("\nError: " + e.getMessage());
            }

        } while (true);

        scanner.close();
    }
}
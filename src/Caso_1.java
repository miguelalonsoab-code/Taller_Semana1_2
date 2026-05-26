
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

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("╔══════════════════════════╗");
        System.out.println("║    CALCULADORA BÁSICA    ║");
        System.out.println("╚══════════════════════════╝");
 
        System.out.println("\n  1 → Suma       (+)");
        System.out.println("  2 → Resta      (-)");
        System.out.println("  3 → Multiplicación (*)");
        System.out.println("  4 → División   (/)");
        System.out.println("  5 → Salir   ");
        System.out.print("\nTu elección: ");
        int opcion = scanner.nextInt();
        
        if(opcion == 5) {
        	System.out.println("\nPrograma finalizado.");
        }
        else {
        	System.out.print("\nIngresa el primer número  : ");
        double num1 = scanner.nextDouble();
 
        System.out.print("Ingresa el segundo número : ");
        double num2 = scanner.nextDouble();
        
        switch (opcion) {
        case 1:
            System.out.printf("\nResultado: %.2f + %.2f = %.2f%n",
                    num1, num2, sumar(num1, num2));
            break;

        case 2:
            System.out.printf("\nResultado: %.2f - %.2f = %.2f%n",
                    num1, num2, restar(num1, num2));
            break;

        case 3:
            System.out.printf("\nResultado: %.2f × %.2f = %.2f%n",
                    num1, num2, multiplicar(num1, num2));
            break;

        case 4:
            try {
                System.out.printf("\nResultado: %.2f / %.2f = %.2f%n",
                        num1, num2, dividir(num1, num2));
            } catch (ArithmeticException e) {
                System.out.println("\nError: " + e.getMessage());
            }
            break;
        default:
            System.out.println("\nOpción no válida. Elige entre 1 y 5.");
    }
        }
        scanner.close();
        System.out.println("\nPrograma finalizado.");
	}

}

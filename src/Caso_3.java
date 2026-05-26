class Operacion{
	
	public static int sumar(int a, int b) {
        System.out.println("  → Invocando sumar(int a=" + a + ", int b=" + b + ")");
        return a + b;
    }
	
	public static double sumar(double a, double b) {
        System.out.println("  → Invocando sumar(double a=" + a + ", double b=" + b + ")");
        return a + b;
    }
	
	public static int sumar(int a, int b, int c) {
	        System.out.println("  → Invocando sumar(int a=" + a + ", int b=" + b + ", int c=" + c + ")");
	        return a + b + c;
	}
	 
}


public class Caso_3 {

	public static void main(String[] args) {
		
		System.out.println("╔══════════════════════════════╗");
        System.out.println("║   SOBRECARGA DE MÉTODOS      ║");
        System.out.println("╚══════════════════════════════╝\n");
        
        System.out.println("Llamada: sumar(5, 3)");
        int resultado1 = Operacion.sumar(5, 3);
        System.out.println("  Resultado = " + resultado1);
 
        System.out.println();
        
        System.out.println("Llamada: sumar(4.5, 2.3)");
        double resultado2 = Operacion.sumar(4.5, 2.3);
        System.out.printf("  Resultado = %.1f%n", resultado2);
 
        System.out.println();
        
        System.out.println("Llamada: sumar(1, 2, 3)");
        int resultado3 = Operacion.sumar(1, 2, 3);
        System.out.println("  Resultado = " + resultado3);
 
        System.out.println();
        
        System.out.println("─────────── Resumen ───────────");
        System.out.println("  sumar(5, 3)      = " + resultado1);
        System.out.printf( "  sumar(4.5, 2.3)  = %.1f%n",  resultado2);
        System.out.println("  sumar(1, 2, 3)   = " + resultado3);
 
        System.out.println("\nPrograma finalizado.");
		

	}

}

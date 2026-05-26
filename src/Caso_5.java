import java.util.ArrayList;
import java.util.Scanner;

public class Caso_5 {
	
	public static boolean validarNombre(String nombre) {
		
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        return nombre.trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+");
    }
	
	 public static void mostrarLista(ArrayList<String> lista) {
	        System.out.println("\n╔══════════════════════════════╗");
	        System.out.println("║    LISTA DE ESTUDIANTES      ║");
	        System.out.println("╚══════════════════════════════╝");
	 
	        if (lista.isEmpty()) {
	            System.out.println("  (No se ingresó ningún estudiante)");
	            return;
	        }
	 
	        for (int i = 0; i < lista.size(); i++) {
	            System.out.printf("  %2d. %s%n", (i + 1), lista.get(i));
	        }
	 
	        System.out.println("─────────────────────────────");
	        System.out.println("  Total registrados: " + lista.size() + " estudiante(s)");
	    }
	 
	 public static int buscarEstudiante(ArrayList<String> lista, String nombre) {
	        for (int i = 0; i < lista.size(); i++) {
	            if (lista.get(i).equalsIgnoreCase(nombre.trim())) {
	                return i;
	            }
	        }
	        return -1;
	    }

	public static void main(String[] args) {
		
		 System.out.println("╔══════════════════════════════╗");
	     System.out.println("║     LISTA DE ESTUDIANTES     ║");
	     System.out.println("╚══════════════════════════════╝");
	     
	     ArrayList<String> estudiantes = new ArrayList<>();
	     
	     Scanner scanner = new Scanner(System.in);
	 
	     System.out.println("\nIngresa nombres de estudiantes.");
	     System.out.println("Escribe \"fin\" para terminar.\n");
	     
	     while (true) {
	            System.out.print("Nombre del estudiante: ");
	 
	            try {
	                String input = scanner.nextLine();
	 
	                if (input.equalsIgnoreCase("fin")) {
	                    System.out.println("  → Ingreso finalizado.");
	                    break;
	                }
	 	                
	                if (!validarNombre(input)) {	                   
	                    throw new IllegalArgumentException(
	                        "\"" + input + "\" no es válido. Solo letras y espacios."
	                    );
	                }
	               
	                estudiantes.add(input.trim());
	                System.out.println("  ✔ Agregado correctamente.\n");
	 
	            } catch (IllegalArgumentException e) {
	                
	                System.out.println("  ⚠ Error: " + e.getMessage());
	                System.out.println("  Solo se permiten letras, tildes y espacios.\n");
	            }
	        }
	 
	        mostrarLista(estudiantes);
	        
	        if (!estudiantes.isEmpty()) {
	            String primero = estudiantes.get(0);
	            int idx = buscarEstudiante(estudiantes, primero);
	            System.out.println("\nBúsqueda de \"" + primero + "\": encontrado en posición " + (idx + 1));
	        }
	 
	        scanner.close();
	        System.out.println("\nPrograma finalizado.");

	}

}

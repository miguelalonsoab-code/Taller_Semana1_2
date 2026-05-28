import java.util.ArrayList;

class Contador {

    private static int totalObjetos = 0;
    private static ArrayList<String> historial = new ArrayList<>();

    private int id;
    private String nombre;

    public Contador(String nombre) {

        totalObjetos++;

        this.id = totalObjetos;
        this.nombre = nombre;

        historial.add(nombre);

        System.out.println("✔ Objeto creado correctamente.");
    }

    // SOBRECARGA DE CONSTRUCTOR
    public Contador() {

        totalObjetos++;

        this.id = totalObjetos;
        this.nombre = "Sin nombre";

        historial.add(this.nombre);
    }

    public static int getCantidad() {
        return totalObjetos;
    }

    public static void resetContador() {

        totalObjetos = 0;
        historial.clear();

        System.out.println("✔ Contador reiniciado.");
    }

    public static void mostrarHistorial() {

        System.out.println("\n===== HISTORIAL DE OBJETOS =====");

        if (historial.isEmpty()) {

            System.out.println("No existen objetos registrados.");
            return;
        }

        for (String nombre : historial) {
            System.out.println("- " + nombre);
        }
    }

    @Override
    public String toString() {

        return "ID: " + id +
               " | Nombre: " + nombre;
    }
}

public class Caso_4 {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║        USO DE STATIC         ║");
        System.out.println("╚══════════════════════════════╝");

        System.out.println("\nObjetos iniciales:");
        System.out.println("Total = " + Contador.getCantidad());

        System.out.println("\nCreando objetos...");

        Contador c1 = new Contador("Objeto Alfa");
        Contador c2 = new Contador("Objeto Beta");
        Contador c3 = new Contador();
        Contador c4 = new Contador("Objeto Gamma");

        System.out.println("\nInformación de objetos:");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("\nTotal actual:");
        System.out.println(Contador.getCantidad());

        Contador.mostrarHistorial();

        System.out.println("\nReiniciando contador...");
        Contador.resetContador();

        System.out.println("Total después del reset:");
        System.out.println(Contador.getCantidad());

        System.out.println("\nPrograma finalizado.");
    }
}
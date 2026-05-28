class Persona {

    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {

        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public void setEdad(int edad) {

        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
}

public class Caso_2 {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════╗");
        System.out.println("║    CLASE PERSONA (POO)   ║");
        System.out.println("╚══════════════════════════╝\n");

        Persona p1 = new Persona("Ana García", 25);
        Persona p2 = new Persona("Luis Torres", 32);

        p1.mostrarDatos();
        p2.mostrarDatos();

        System.out.println("\nActualizando datos:");

        p1.setEdad(26);
        p2.setNombre("");

        System.out.println("\nDatos finales:");
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
class Persona{
	private String nombre;
    private int    edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad   = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
 
    public int getEdad() {
        return edad;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println(" Edad: la edad no puede ser negativa. Valor ignorado.");
        }
    }
 
    public void mostrarDatos() {
        System.out.println("  ┌─────────────────────────┐");
        System.out.println("  │  Nombre : " + nombre);
        System.out.println("  │  Edad   : " + edad + " años");
        System.out.println("  └─────────────────────────┘");
    }
}


public class Caso_2 {

	public static void main(String[] args) {
		
		System.out.println("╔══════════════════════════╗");
        System.out.println("║    CLASE PERSONA (POO)   ║");
        System.out.println("╚══════════════════════════╝\n");
        
        Persona p1 = new Persona("Ana García",  25);
        Persona p2 = new Persona("Luis Torres", 32);
        
        System.out.println("Objeto 1:");
        p1.mostrarDatos();
 
        System.out.println("\nObjeto 2:");
        p2.mostrarDatos();
        
        System.out.println("\nUsando getters:");
        System.out.println("  Nombre de p1 : " + p1.getNombre());
        System.out.println("  Edad   de p2 : " + p2.getEdad());
        
        System.out.println("\nActualizando datos de p1:");
        System.out.println("  Intentando setEdad(-5)...");
        p1.setEdad(-5);  
        
        System.out.println("  Intentando Edad(26)...");
        p1.setEdad(26);
        
        System.out.println("\nDatos de p1 tras la actualización:");
        p1.mostrarDatos();
 
        System.out.println("\nPrograma finalizado.");
        
	}
}

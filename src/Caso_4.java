class Contador{
	
	private static int totalObjetos = 0;
	private String nombre;
    private int    id;   
    
    public Contador(String nombre) {
        totalObjetos++;              
        this.id     = totalObjetos; 
        this.nombre = nombre;
 
        System.out.println("  ✔ Creado [id=" + id + "] " + nombre
                + "  |  Total en memoria: " + totalObjetos);
    }
    
    public static int getCantidad() {
        return totalObjetos;
    }
    
    public static void resetContador() {
        totalObjetos = 0;
        System.out.println("  ↺ Contador reiniciado a 0.");
    }
    
    public void mostrarInfo() {
        System.out.println("  Objeto → id=" + id + ", nombre='" + nombre + "'");
    }
    
}



public class Caso_4 {

	public static void main(String[] args) {
		
		System.out.println("╔══════════════════════════════╗");
        System.out.println("║      USO DE STATIC           ║");
        System.out.println("╚══════════════════════════════╝\n");
        
        System.out.println("Antes de crear objetos:");
        System.out.println("  Contador.getCantidad() = " + Contador.getCantidad());
        
        System.out.println("\nCreando objetos:");
        Contador c1 = new Contador("Objeto Alfa");
        Contador c2 = new Contador("Objeto Beta");
        Contador c3 = new Contador("Objeto Gamma");
        
        System.out.println("\nTotal tras crear 3 objetos: " + Contador.getCantidad());
        
        System.out.println("\nDatos de cada objeto:");
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        
        System.out.println("\nDemostración de reset:");
        Contador.resetContador();
        System.out.println("  getCantidad() ahora = " + Contador.getCantidad());
        
        System.out.println("\nCreando un objeto tras el reset:");
        Contador c4 = new Contador("Objeto Delta");
        System.out.println("  Total = " + Contador.getCantidad());
 
        System.out.println("\nPrograma finalizado.");
		

	}

}

package Exercises;

public class Padre {
    String apellido;
    public Padre(String apellido){
        this.apellido = apellido;
    }
   
}

/ Método test que crea una instancia de EspirituSanto y llama a pruebaPaternidad
    public void test() {
        // Creación del objeto Hijo
        Hijo hijo = new Hijo("Juan", this.apellido);
        
        // Creación del objeto EspirituSanto
        EspirituSanto espirituSanto = new EspirituSanto(hijo.nombre, this.apellido, "Lopez");
        
        // Llamada al método pruebaPaternidad
        Boolean resultado = espirituSanto.pruebaParternidad();
        System.out.println("El resultado de la prueba de paternidad es: " + resultado);
    }

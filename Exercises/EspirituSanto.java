package Exercises;

public class EspirituSanto extends Hijo {
    String apellidoReal;

    public EspirituSanto(String nombre, String apellido, String apellidoReal) {
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }

    // Método que verifica si el apellido coincide con el apellidoReal
    public Boolean pruebaParternidad() {
        return this.apellido.equals(this.apellidoReal);
    }
}

package modelo;
import interfaces.IPersona;
public class Persona implements IPersona{
	private String dni;
    private String nombre;
    private int edad;
 
    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

	@Override
	public String getDni() {
		return dni;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
 
	
   
}

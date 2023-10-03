package Persona;

public class Persona {

	// 1Atributos
	String nombre, apellido, telefono, email;
	byte edad;

	// 2 Constructor
	public Persona(String nombre, String apellido, byte edad, String email, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.edad = edad;
	}

	// 3 Metodos

	void imprimirInfo() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("El apellido es:: " + apellido);
		System.out.println("La edad es: " + edad);
		System.out.println("El telefono es: " + telefono);
		System.out.println("El email es: " + email);
	}

	void saludar() {
		System.out.println("Hola, te mando saluditos");
	}

	// 4 Instancias

}// Cierre poo

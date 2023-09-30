package dataTypes;

public class DatosEstructurados {
	public static void main(String[] args) {
		/*
		 * Datos estructurados. Son datos complejos que almacenan caracteres y/o cadenas
		 * de caracteres o bien, algún tipo de dato primitivo -- String. Cadena de
		 * Caracteres, se declaran entre comillas y hay que definir el tipo de dato con
		 * la palabra reservada String -- Arrays. -- Creados por el usuario (API Java)
		 */
		String myString = "Hola, soy un string";
		System.out.println(myString);

		String helloString = new String("Hola, soy un segundo String");
		System.out.println(helloString);

		/*
		 * Metodo para Strings --String length. Metodo que permite medir la longitud de
		 * una cadena de caracteres
		 */
		String texto = "weqaewafas";
		int metodoLength = texto.length();
		System.out.println("La longitud de la variable texto de tipo string es: " + metodoLength);

		/*
		 * Guardando la variable texto en una variable de tipo int para pasarle el
		 * metodo length int metodoLength = texto.Length --output: 10 Imprimimos en
		 * consola la nueva Variable syso(metodoLength);
		 */

		// --String: toUpperCase() y toLowerCase
		String upperCase = texto.toUpperCase();
		System.out.println("Aplicamos el metodo toUpperCase: " + upperCase);

		String lowerCase = texto.toLowerCase();
		System.out.println("Aplicamos el metodo toLowerCase: " + lowerCase);

		// -- indexOff(). Devuelve el índice de la primera aparición de un texto
		// específico
		String fraseMotivicional = "Todo es temporal, echale ganitas";
		int indexOf = fraseMotivicional.indexOf("temporal"); // 8
		System.out.println("La palabra 'temporal' inicia en el índice: " + indexOf);

		// -- Concatenación
		String firstName = "Daniel ";
		String lastName = "Maldonado";

		String userNAme = firstName + " " + lastName;
		System.out.println(userNAme);

		System.out.println(firstName.concat(lastName));

		// -- Métodos de conversión (parseo)
		String presupuesto = "50000";
		System.out.println("El presupuesto es de $" + presupuesto + " y el tipo de dato es "
				+ presupuesto.getClass().getSimpleName());

		int parseao = Integer.parseInt(presupuesto);
		System.out.println("Aplicando parseInt, el valor de " + presupuesto + " de tipo "
				+ presupuesto.getClass().getSimpleName() + " ahora es " + parseao + " que ahora es de tipo "
				+ ((Object) parseao).getClass().getSimpleName());

		/*
		 * Arrays. Conocidos como arreglos, se trata de una colección de datos del mismo
		 * tipo donde cada elemento corresponde a una posición identificada por índices
		 * numéricos. Cuando trabajamos con arreglos de dos dimensiones
		 * (bidimensionales), usamos el término matriz
		 */

		String[] cars = { "Volkswagen", "Mazda", "Kia", "Ford" };
		System.out.println(cars);

		/*
		 * Variable por tipo de declaración -- Variables dinámicas. Son aquellas que se
		 * declaran con un valor pero que dicho valor puede cambiar durante el proceso.
		 * -- Variables constantes o finales. Su valor no puede modificarse. --
		 * Variables literales (palabras reservadas). Su identificador es la
		 * representación de su valor y ya tiene un significado en el código fuente de
		 * Java
		 * 
		 */

		float gastosMensuales = 35684.10f;
		System.out.println(gastosMensuales);

		gastosMensuales = 42699.2f;
		System.out.println("Ahora mis gastos mensuales ascienden a " + gastosMensuales);

		// Variables finales o constantes
		final int SALARIO = 15000;
		System.out.println(SALARIO);

	}
}

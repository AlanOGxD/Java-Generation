package dataTypes;

public class DatosPrimitivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Jelou");

		/*
		 * Datos primitivos. Datos fundamentales en Java que sirven para gestionar los
		 * tipos de información más básicos Existen 8 tipos de datos primitivos: byte,
		 * short, int, long, float, dohble, boolean, char
		 */
		// byte age = 28;
		// System.out.println(age);// sysout
		// System.out.println();// syso

		// vmin y Vmax
		byte maxByte = Byte.MAX_VALUE;
		byte minByte = Byte.MIN_VALUE;
		System.out.println("El valor minimo de BYTE es: " + minByte);
		System.out.println("El valor maximo de BYTE es: " + maxByte);

		System.out.println();

		// short vmas y vmin
		short minShort = Short.MIN_VALUE;
		short maxShort = Short.MAX_VALUE;
		System.out.println("El valor minimo de short es: " + minShort);
		System.out.println("El valor maximo de short es: " + maxShort);
		System.out.println();
		// char, Vmin y Vmax
		char minChar = Character.MIN_VALUE;
		char maxChar = Character.MAX_VALUE;
		System.out.println("El valor minimo de CHAR es: " + minChar);
		System.out.println("El valor maximo de CHAR es: " + maxChar);

		System.out.println();
		// int
		int minInt = Integer.MIN_VALUE;
		int maxInt = Integer.MAX_VALUE;
		System.out.println("El valor minimo de INT es: " + minInt);
		System.out.println("El valor maximo de INT es: " + maxInt);

		System.out.println();
		// long
		long minLong = Long.MIN_VALUE;
		long maxLong = Long.MAX_VALUE;
		System.out.println("El valor minimo de LONG es: " + minLong);
		System.out.println("El valor maximo de LONG es: " + maxLong);

		System.out.println();
		// float
		float minFloat = Float.MIN_VALUE;
		float maxFloat = Float.MAX_VALUE;
		System.out.println("El valor minimo de FLOAT es: " + minFloat);
		System.out.println("El valor maximo de FLOAT es: " + maxFloat);

		System.out.println();
		// boolean
		System.out.println();
		// double
		double minDouble = Double.MIN_VALUE;
		double maxDouble = Double.MAX_VALUE;
		System.out.println("El valor minimo de DOUBLE es: " + minDouble);
		System.out.println("El valor maximo de DOUBLE es: " + maxDouble);

		char valorChar1 = 64;
		char valorChar2 = 60;
		System.out.println(valorChar1);
		System.out.println(valorChar2);

		char aChiquita;
		aChiquita = 166;
		System.out.println(aChiquita);

		/*
		 * Casteo (Conversacion de tipos de java) --Automatico (dato mas pequeño a un
		 * dato mas grande) --manual (tipo de dato mas grande a tipo de dato mas
		 * pequeño)
		 * 
		 */

		int myNumber = 125;
		System.out.println(myNumber);
		// int < double
		double myCasting = myNumber;
		System.out.println(myCasting);

		short edad = 25;
		int valorEdad = edad;
		System.out.println(edad);
		System.out.println(valorEdad);
	}

}

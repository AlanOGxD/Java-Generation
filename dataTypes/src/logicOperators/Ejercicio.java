package logicOperators;

import java.util.Scanner;

public class Ejercicio {
	public static void main(String[] args) {

		// Enrique, Paola y Mariana se dirigen a la MacStore y deciden comprar un iPhone
		// 15 cada uno. La tienda tiene una promoción por el mes patrio: "Si el total de
		// tu compra supera los 25 mil pesos, obtén un 10% de descuento". Enrique, Paola
		// y Mariana deciden comprar los tres equipos con una sola tarjeta. Al llegar a
		// caja, la cajera les menciona que la tienda en estos momentos cuenta con una
		// promoción de 12 meses sin intereses, por lo tanto, deciden pagar con la TDC
		// de Mariana. ¿Cuál sería el costo total por los 3 equipos sin descuento?
		// ¿Aplicaría el descuento en su compra? ¿Cuál sería el costo total con el
		// descuento aplicado? ¿Cuánto pagarían mensualmente?

		// 15 128 - 19499
		/*
		 * 15 256 21499 - 15 512 25999
		 * 
		 * 15p 128 21999 15p 256 23999 15p 512 28499
		 */
		Scanner sc = new Scanner(System.in);

		double costoPersonalizado = 0;
		int defecto = 0;
		System.out.println(
				"¿Desea seleccionar los telefonos o utilizar el precio por defecto?\n1). Precios por defecto\n2). Precios personalizados");
		try {
			defecto = sc.nextInt();
		} catch (Exception e) {
			System.out.println("No es un numero xD");
		}

		switch (defecto) {
		case 1:
			double costo = (19499 * 3);
			System.out.println("El costo total es de " + costo);
			if (costo > 25000) {
				costo = (costo - (costo * .1));
				System.out.println("Se otorgo un descuento del 10% y el costo bajo a " + costo);
			}
			costo = costo / 12;
			System.out.println("La promocion de meses sin intereses es de " + costo + " mensual.");
			break;
		case 2:
			int persona = 0;
			do {
				System.out.println("¿Que modelo deseas elegir? para la persona " + (persona + 1)
						+ "\n 1). Iphone 15\n 2). Iphone 15 plus");
				int modelo = sc.nextInt();

				System.out.println("Seleccione el almacenamiento:\n 1). 128GB \n 2). 256GB \n 3). 512GB");
				int op = sc.nextInt();
				switch (modelo) {
				case 1:

					switch (op) {
					case 1:
						costoPersonalizado += 19499;
						break;
					case 2:
						costoPersonalizado += 21499;
						break;
					case 3:
						costoPersonalizado += 25999;
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + op);
					}
					persona++;
					break;
				case 2:
					switch (op) {
					case 1:
						costoPersonalizado += 21999;
						break;
					case 2:
						costoPersonalizado += 23999;
						break;
					case 3:
						costoPersonalizado += 28499;
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + op);
					}
					persona++;
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + modelo);
				}

			} while (persona < 3);
			System.out.println("El costo total es de " + costoPersonalizado);
			if (costoPersonalizado > 25000) {
				costoPersonalizado -= costoPersonalizado * .1;
				System.out.println("Se otorgo un descuento del 10% y el costo bajo a " + costoPersonalizado);
			}
			costoPersonalizado /= 12;
			System.out.println("La promocion de meses sin intereses es de " + costoPersonalizado + " mensual.");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + defecto);
		}

	}
}

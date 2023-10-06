package Collections;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array
		//tipo de datos del array, nombre, instancia del objeto, arreglo, los datos
		String[] listaDeCompras = new String[] {
				"Leche", "Pan", "Huevos"
				};
		
		//Esta impresión solo muestra el espacio de memoria
		System.out.println(listaDeCompras);
		
		//Imprimir info de listaDeCompras con un forEach
		//Para el dato de tipo String que llamaremos productoAImprimir de la lista de compras, lo valos a tomar y lo vamos a imprimir
		for(String productoAImprimir : listaDeCompras) {
			System.out.println(productoAImprimir);
		}
		
		
		
		
	}

}


/*
 * Colecciones
 * 
 * 	-Arrays (arreglos)
 * 
 * 	Es una estructura de datos olineal que contiene elementos del mismo tipo. Los elementos están almacenados de forma contigua (uno al lado del otro), y se pueden acceder a ellos a través de un índice. Las principales características de un array son:
 * 
 * 		- Es una estructura de datos fija, generalmente almacena datos del mismo tipo.
 * 		- La longitud de un array se establece al momento e crearlo, y no cambia.
 * 		- Podemos acceder a elementos per medio de un índice.
 * 		- Los arrays pueden contener datos primitivos y objetos
 * 		- No proporciona métodos adicionales para agregar o eliminar elementos
 * 
 * 
 * Un ejemplo de array es una lista de compras del supermercado
 */
/*- ArrayList
 * 
 * 
 * Es una implementacion de una lista (List), es decir, que esta en un nivel abajo de las listas. Utiliza un array dinamico que permite almacenar datos.
 * 
 * Sus principales caracteristicas son:
 * 
 * 	- Tamanio dinamico, a diferencia de los arrays tradicionales, el tamanio de un arrayList si se puede modificar.
 *  - Acceso rapido, podemos acceder a un elemento del arrayList por su posicion o indice
 *  - Coste elevado al momento de insertar o eliminar elementos. Si agrego un elemento, tengo que recorrer todos los demas elementos.*/
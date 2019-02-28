/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  05:09pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio67_PalabraEnMedio {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.print("Ingrese 2 palabras: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string
	System.out.print("Ingrese una palabra para poner en medio: ");// imprime el mensaje en pantalla
	String palabra = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable palabra de tipo string

	String[] arreglo=enun.split(" ");// declaro un arreglo de strings y le asigno la variable enun y con .split(" ") separo las palabras sin contar los espacios en blanco

	System.out.println(arreglo[0]+" "+palabra+" "+arreglo[1]);
	// imprimo la primero posicion del arreglo, agrego un espacio en blanco pongo la palabra y despues otro espacio en blanco y al final la segunda posicion del arreglo
	}			
}
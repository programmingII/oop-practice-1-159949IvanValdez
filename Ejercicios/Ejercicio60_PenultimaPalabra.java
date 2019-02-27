/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  02:54pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio60_PenultimaPalabra {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
    	
	System.out.print("Ingrese un enunciado: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string

	String[] palabras = enun.split(" ");
	//declaramos un arreglo de String llamado palabras y le asignamos el string  enun, con . split(" ") separamos el string sin contar los espacios en blanco " ", es decir,
	// dividimos el string enun en palabras y cada una de ellas la asignamos al arreglo palabras pero sin contar con espacios en blanco, solo las palabras se van a guardar

	System.out.println("Penultima palabra: "+palabras[palabras.length - 2]);
	// con palabras[palabras.length - 2] decimos que del arreglo palabras vamos a imprimir la que se encuentra en el penultimo lugar del arreglo
	}			
}
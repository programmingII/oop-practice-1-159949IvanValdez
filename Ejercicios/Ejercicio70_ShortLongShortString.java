/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  05:42pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio70_ShortLongShortString {
	public static void main(String[] args){	
     		Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.print("Ingrese un enunciado: ");// imprime el mensaje en pantalla
		String enun1 = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun1 de tipo string
		System.out.print("Ingrese otro enunciado: ");// imprime el mensaje en pantalla
		String enun2 = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun2 de tipo string

		if(enun1.length()>=enun2.length()) System.out.println(enun2+enun1+enun2);
		//si el tamaño del enun1 es mayor que el de enun2 entonces se imprime enun2+enun1+enun2
		else System.out.println(enun1+enun2+enun1);
		//en caso contrario se imprime enun1+enun2+enun1
	}			
}
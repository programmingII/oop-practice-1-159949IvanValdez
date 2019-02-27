/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  03:38pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio62_MayorVeinte{
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.print("Ingrese el primer numero: ");// imprime el mensaje en pantalla
	int n1 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n1 de tipo entero
 	System.out.print("Ingrese el segundo numero: ");// imprime el mensaje en pantalla
	int n2 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n2 de tipo entero
	System.out.print("Ingrese el tercer numero: ");// imprime el mensaje en pantalla
	int n3 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n3 de tipo entero

	System.out.println((Math.abs(n1 - n2) >= 20 || Math.abs(n2 - n3) >= 20 || Math.abs(n3 - n1) >= 20));
	//usando Math.abs() se puede obtener el valor absoluto de una opercion, si alguna de las condiciones se cumple se imprime true en caso contrario se imprime false 

	}			
}
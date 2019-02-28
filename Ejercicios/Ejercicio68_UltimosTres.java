/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  05:29pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio68_UltimosTres {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.print("Ingrese un enunciado: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string
	
	String ultimos=enun.substring(enun.length()-3);//con .substring obtengo los ultimos 3 caracteres de la variable enun

	System.out.println(ultimos+ultimos+ultimos+ultimos);
	//imprimo 4 veces la subcadena de los ultimos 3 caracteres
	}			
}
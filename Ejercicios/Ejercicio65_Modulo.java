/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  04:12pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio65_Modulo{
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.println("Ingrese el primer numero: ");// imprime el mensaje en pantalla
	int n1 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n1 de tipo entero
 	System.out.println("Ingrese el segundo numero: ");// imprime el mensaje en pantalla
	int n2 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n2 de tipo entero
	
	int modulo=n1-((n1/n2)*n2);// con esta operacion obtenemos el modulo
	
	System.out.println(modulo);//se imprime el resultado
	}			
}
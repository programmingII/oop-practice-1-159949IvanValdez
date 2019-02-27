/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  03:46pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio63_ValorMayor{
	public static void main(String[] args){	
     		Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.print("Ingrese el primer numero: ");// imprime el mensaje en pantalla
		int n1 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n1 de tipo entero
 		System.out.print("Ingrese el segundo numero: ");// imprime el mensaje en pantalla
		int n2 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n2 de tipo entero
	
		if(n1==n2) System.out.println(0);//si ambos son iguales se imprime 0 
		if(n1>n2) System.out.println(n1);// si n1 es mayor se imprime n1
		if(n1<n2) System.out.println(n2);// si n2 es mayor se imprime n2
		if(n1%6==n2%6){//si sus residuos con 6 son iguales se va a imprimir el menor de los 2 numeros
			if(n1>n2) System.out.println(n2);//su n1 es mayor se imprime n2
			else System.out.println(n1);// en caso contrario se imprime n1
		}
	}			
}
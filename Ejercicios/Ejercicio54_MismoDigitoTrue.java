/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  03:11pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio54_MismoDigitoTrue{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese el primer numero: ");
		int n1=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n1
		System.out.println("Ingrese el segundo numero: ");
		int n2=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n2
		System.out.println("Ingrese el tercer numero: ");
		int n3=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n3

		if( (n1 % 10 == n2 % 10) || (n1 % 10 == n3 % 10) || (n2 % 10 == n3 % 10)) System.out.println("El resultado de la suma es: True");// si la condicion se cumple imprime el mensaje
		else System.out.println("El resultado de la suma es: False");// si la condicion no se cumple imprime el mensaje
	}
}
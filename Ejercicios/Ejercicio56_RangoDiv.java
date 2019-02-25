/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  03:34pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio56_RangoDiv{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese el numero menor: ");
		int n1=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n1
		System.out.println("Ingrese el numero mayor: ");
		int n2=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n2
		System.out.println("Ingrese el numero por el que se dividen: ");
		int div=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable div

		if(n1%div==0)//evaluo si el primer numero es divisible
			System.out.println((n2/div)-(n1/div)+1);//si se cumple la condicion imprimo el resultado +1 
		else System.out.println((n2/div)-(n1/div));// en caso contrario imprimo el resultado
	}
}
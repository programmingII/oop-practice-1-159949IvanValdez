/* 159949 Luis Ivan Valdez Anchondo 24/02/2019  01:02pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio44_SumaIncremental {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	System.out.println("Ingrese un numero: "); //Imprime el mensaje
	int n=sc.nextInt();//Declaramos la variable n como int y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextInt() del objeto sc 
	
	System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);//imprime los resultados

	}
}
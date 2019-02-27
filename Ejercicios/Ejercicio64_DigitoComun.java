/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  03:58pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio64_DigitoComun{
	public static void main(String[] args){	
     		Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese el primer numero: ");// imprime el mensaje en pantalla
		int n1 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n1 de tipo entero
 		System.out.println("Ingrese el segundo numero: ");// imprime el mensaje en pantalla
		int n2 = sc.nextInt();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable n2 de tipo entero
		
		if(n1<25 || n2>75) System.out.println("false");
		else{
			int digiton1=n1%10;//declaro la variable digiton1 como entero y con n1%10 obtengo el digito derecho de n1
			int digiton2=n2%10;//declaro la variable digiton2 como entero y con n2%10 obtengo el digito derecho de n2
			n1/=10;//con esta operacion obtengo el digito izquierdo de n1
			n2/=10;//con esta operacion obtengo el digito izquierdo de n2
			System.out.println(n1==n2||n1==digiton2||digiton1==n2||digiton1==digiton2);// si alguna de las condiciones se cumple se imprime true
		}
	}			
}
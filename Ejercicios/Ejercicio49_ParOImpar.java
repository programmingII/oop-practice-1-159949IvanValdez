/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  02:26pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio49_ParOImpar{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
		System.out.println("Ingrese un numero entero: ");
		int n=sc.nextInt();// aqui usamos el metodo del objeto para recibir un valor del teclado y lo asignamos a la variable n
		if (n % 2 == 0)   System.out.println(1); // si la condicion se cumple quiere decir que es par y entonces imprimimos 1
                else System.out.println(0); // en caso contrario quiere decir que es impar por lo que imprimimos 0
	}
}
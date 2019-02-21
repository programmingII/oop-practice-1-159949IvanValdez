/* 159949 Luis Ivan Valdez Anchondo 21/02/2019  12:46pm.*/

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio33_SumaDigitosInt{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in	
	
	System.out.println("Ingrese un numero entero");// imprime el mensaje en pantalla 
	long num=sc.nextLong();//Declaramos la variable num como long y le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLong() del objeto sc 
	
	int sum=0;// declaro la variable sum para que sea mi acumulador 
	while (num!=0){//mientras que el numero sea diferente de 0 se va a repetir el proceso
		sum+=num%10;// Este me da el ultimo digito
		num/=10;// Este elimina el ultimo digito
	}	
	
	System.out.println("El resultado de la suma de los digitos es: "+sum);// imprimo en pantalla el mensaje junto a el resultado

	}
}
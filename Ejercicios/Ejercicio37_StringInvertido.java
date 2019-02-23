/* 159949 Luis Ivan Valdez Anchondo 23/02/2019 02:12p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio37_StringInvertido{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	
		System.out.println("Ingrese una cadena de texto"); //Imprime el mensaje en pantalla
		char[] cadena = sc.nextLine().toCharArray();//Declaramos un arreglo de char llamado cadena, le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc y con .toCharArray() nos aseguramos de convertir el string en un arreglo de chars
       		System.out.print("La cadena invertida es: ");//Imprime el mensaje en pantalla
        	for (int i = cadena.length - 1; i >= 0; i--) { //utilizamos el ciclo for para invertir el orden de las letras del arreglo, igualando a la variable i a el tamaño del arreglo con .length
            		System.out.print(cadena[i]); //imprime el ultimo caracter del arreglo 
        	}
	}
}
/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  03:14pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio61_PalabraInvertida {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	System.out.print("Ingrese una palabra: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string
 	
	enun = enun.trim();// igualamos a el string enun a el mismo y le agregamos el .trim() para que cualquier espacio en blanco antes de despues del strung sea removido
	String inversa = ""; // declaramos este string llamado inversa con "" el cual me servira para guardar la palabra invertida

     	char[] palabra=enun.toCharArray();  // declaramos aun arreglo de char llamado palabra y con .toCharArray() convertimos el string enum a un arreglo de chars
	
	for (int i = palabra.length - 1; i >= 0; i--) {// con este ciclo for nos aseguramos de recorrer la palabra
		inversa += palabra[i];//a la variable inversa le asignamos de la ultima letra del arreglo hasta la primera una vez que acabe el ciclo for 
	}

	System.out.println("La palabra invertida es: "+inversa.trim());//imprimimos la palabra invertida y con .trim() con aseguramos de remover cualquier espacio en blanco antes o despues del string 
	}			
}
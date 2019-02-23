/* 159949 Luis Ivan Valdez Anchondo 23/02/2019 02:43p.m */

import java.util.Scanner; //me permite escanear una entrada por teclado

public class Ejercicio38_StringEvaluar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
	
		System.out.println("Ingrese el String a evaluar: "); //Imprime el mensaje en pantalla
		String cadena = sc.nextLine();//Declaramos un arreglo de char llamado cadena, le asignamos el valor que se ingreso por medio del teclado usando el metodo nextLine() del objeto sc 
		
		char[] ev=cadena.toCharArray();//convertimos la cadena a un arreglo de chars
		int letras=0;//Declaramos la variable letras y la iniciamos en 0
		int espacios=0;// Declaramos la variable espacios y la iniciamos en 0
		int numeros=0;//Declaramos la variable numeros y la iniciamos en 0
		int otros=0;//Declaramos la variable otros y la iniciamos en 0

		for(int i = 0; i < cadena.length(); i++){//uso un ciclo for para recorrer el arreglo y aumentar los acumuladores segun si el caracter leido es un numero, un espacio, una letra u otros.
			if(Character.isLetter(ev[i])){//usamos el metodo .isLetter de la clase Character para saber si el caracter a evaluar es una letra, si es el caso se incrementa el contador letras en 1
				letras++ ;
			}
			else if(Character.isDigit(ev[i])){//usamos el metodo .isDigit de la clase Character para saber si el caracter a evaluar es un digito, si es el caso se incrementa el contador numeros en 1
				numeros++ ;
			}
			else if(Character.isSpaceChar(ev[i])){//usamos el metodo .isSpaceChar para saber si el caracter a evaluar es una espacio, si es el caso se incrementa el contador espacios en 1
				espacios++ ;
			}
			else{	//Si ninguno de los otros casos se cumple entonces se incrementa el contador de otros en 1
				otros++;
			}
		}

		System.out.println("La cadena es: "+cadena);//Inprime en pantalla la cadena que evaluamos
		System.out.println("Letras: "+letras);// imprime la cantidad de letras que contiene
		System.out.println("Espacios: "+espacios);//imprime la cantidad de espacios que tiene
		System.out.println("Numeros: "+numeros);//imprime la cantidad de numeros que tiene
		System.out.println("Otros: "+otros);//imprime la cantidad de caracteres que no son letras, numeros o espacios.
	}
}
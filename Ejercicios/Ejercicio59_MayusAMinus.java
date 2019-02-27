/* 159949 Luis Ivan Valdez Anchondo 27/02/2019  02:41pm.*/

import java.util.Scanner;//me permite escanear una entrada por teclado

public class Ejercicio59_MayusAMinus {
	public static void main(String[] args){	
     	Scanner sc = new Scanner(System.in);// Aqui creamos un objeto de la clase Scanner al cual llame sc y lo asociamos al teclado con System.in
    	
	System.out.print("Ingrese un enunciado: ");// imprime el mensaje en pantalla
	String enun = sc.nextLine();// aqui usamos el metodo nextLine() del objeto sc para recibir un valor del teclado y lo asignamos a la variable enun de tipo string

	enun = enun.toLowerCase();//igualamos la variable enun a ella misma pero le agregamos .toLowerCase() para convertir todos las letras del string a minusculas

	System.out.println(enun); //imprimimos el string ya convertido a minusculas
	}			
}
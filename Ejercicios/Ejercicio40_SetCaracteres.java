/* 159949 Luis Ivan Valdez Anchondo 23/02/2019 09:50p.m */

import java.nio.charset.Charset;//importamos a la clase Charset que es usada para crear decodificadores y codificadores

public class Ejercicio40_SetCaracteres{
	public static void main(String[] args){
		System.out.println("Lista de character sets disponibles: ");//se imprime en pantalla el mensaje 
    		for (String caracteres : Charset.availableCharsets().keySet()) {// usamos un for porque no sabemos cuantos datos son, cuando se acaben el ciclo terminara
      			System.out.println(caracteres);// imprime los caracteres 
    		}
	}					
}
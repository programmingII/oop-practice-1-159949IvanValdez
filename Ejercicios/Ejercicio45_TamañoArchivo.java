/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  01:29pm.*/

import java.io.File;//La clase File nos proporciona información acerca de los archivos, de sus atributos, de los directorios, etc.

public class Ejercicio45_TamañoArchivo {
	public static void main(String[] args) {
		System.out.println("C://Users//ivanv//Desktop//Semestre 6//Programacion ll//Ejercicios//Ejercicio38_StringEvaluar.java : " + new File("Ejercicio38_StringEvaluar.java").length() + " bytes");
 		System.out.println("C://Users//ivanv//Desktop//Semestre 6//Programacion ll//Ejercicios//Ejercicio31_JavaVersion.java : " + new File("Ejercicio31_JavaVersion.java").length() + " bytes");
		// si el archivo que ponemos en new File("Ejercicio38_StringEvaluar.java") existe entonces con .length podemos saber el tamaño de dicho archivo
	}
}
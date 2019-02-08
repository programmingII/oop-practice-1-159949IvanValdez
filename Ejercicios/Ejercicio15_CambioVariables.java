/* 159949 Luis Ivan Valdez Anchondo 08/02/2019 02:52p.m.*/

public class Ejercicio15_CambioVariables{
	public static void main(String[] args){

	int a=3, b=9, n;// declaramos las variables
	
	System.out.println("Antes del cambio: a="+a+ " b="+b);// mostramos los valor antes del cambio

	n=a;// usamos nuestra variable n como un comodin y lo igualamos a el valor de a
	a=b;// el valor de a lo cambiamos por el valor de b
	b=n;// al final el valor de b lo igualamos al valor original de a guardado en la variable comodin n

	System.out.println("Despues del cambio: a="+a+" b="+b);// mostramos los valores despues del cambio 
	}
}
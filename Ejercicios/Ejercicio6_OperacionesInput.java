/* 159949 Luis Ivan Valdez Anchondo 05/02/2019 01:30pm. */

import java.util.Scanner;

class Ejercicio6_OperacionesInput{
	public static void main(String[] args){
	
	Scanner num = new Scanner(System.in);
	System.out.println("Ingrese un numero entero");
	int n1=num.nextInt();

	System.out.println("Ingrese otro numero entero");
	int n2=num.nextInt();

	System.out.println(n1+"+"+n2+"="+(n1+n2));
	System.out.println(n1+"-"+n2+"="+(n1-n2));
	System.out.println(n1+"x"+n2+"="+n1*n2);
	System.out.println(n1+"/"+n2+"="+n1/n2);
	System.out.println(n1+"%"+n2+"="+n1%n2);
	}
}
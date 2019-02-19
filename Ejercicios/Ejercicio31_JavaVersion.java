/* 159949 Luis Ivan Valdez Anchondo 18/2/2019 10:46 pm */

public class Ejercicio31_JavaVersion{
	public static void main(String[] args){
    	
	System.out.println("\nJava Version: "+System.getProperty("java.version"));//se obtiene la version de java con getProperty de la clase System 
    	System.out.println("Java Runtime Version: "+System.getProperty("java.runtime.version")); //se obtiene la version runtime de java con getProperty de la clase System
    	System.out.println("Java Home: "+System.getProperty("java.home")); //se obtiene home de java con getProperty de la clase System
    	System.out.println("Java Vendor: "+System.getProperty("java.vendor"));//se obtiene el vendor de java con getProperty de la clase System
    	System.out.println("Java Vendor URL: "+System.getProperty("java.vendor.url"));//se obtiene vendor URL de java con getProperty de la clase System
    	System.out.println("Java Class Path: "+System.getProperty("java.class.path")+"\n");//se obtiene la versionla class path de java con getProperty de la clase System

	}
}
/* 159949 Luis Ivan Valdez Anchondo 25/02/2019  01:56pm.*/

import java.text.SimpleDateFormat;// la clase SimpleDateFormat es para dar formatos a las fechas de una manera sensible al entorno local
import java.util.Calendar;//la clase Calendar es una clase abstracta que nos permite manejar los años, meses, dias, horas en otro formato
import java.util.TimeZone;//La clase TimeZone representa un dezplasamiento de zonas horarias y tambien calcula el horario de verano.

public class Ejercicio47_FechaFormato{
	public static void main(String[] args) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");//creo un objeto de la clase SimpleDateFormat llamado formato y entre parentesis le asigna el tipo de formato que quiero
		formato.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		//uso el metodo getInstance de la clase Calendar que va devuelve la hora y fecha local del system, De la clase TimeZone utilizo el metodo getTimeZone que nos da la hora del lugar que especificamos que en este caso es GTM para horas y minutos
		System.out.println("\nFecha: "+formato.format(System.currentTimeMillis()));// con currentTimeMillis() obtenemos la hora del sistema en milisegundos 
	}
}
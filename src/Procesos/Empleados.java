package Procesos;

import java.util.Scanner;

public class Empleados extends Thread{
	Scanner nom = new Scanner(System.in);
	String n, d;
	double h;
	public Empleados(String nombre, String dia, double hora) {
		n=nombre;
		d=dia;
		h=hora;
		System.out.println("Ingresar nombre: ");
		n=nom.next();
		System.out.println("Ingrese el dia: ");
		d=nom.next();
		System.out.println("Ingrese la hora: ");
		h=nom.nextDouble();
	}
	public void run() {
		if(h>8.00) {
			System.out.println(n+ " llego tarde el dia " +d);
		}else {
			System.out.println(n+ " llego temprano el dia " +d);
		}
	}
	 public static void main(String []args) throws InterruptedException{
		  Thread usuario1 = new Empleados(" "," ",0);
		    usuario1.start();
		  Thread.sleep(3000);
		  Thread usuario2 = new Empleados(" "," ",0);
		    usuario2.start();
		 }

}

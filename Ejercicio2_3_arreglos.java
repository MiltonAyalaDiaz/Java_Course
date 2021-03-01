package com.quantummad.Java_Course;

import javax.swing.JOptionPane;

public class Ejercicio2_3_arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 //Ejercicio1 video40
		 int [] arreglo_eje2 = new int [10];
		 int valor1 = 0;
		 int valor_prom=0;

		 for (int n=0; n<10; n+=1) {
			 valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite valor para el arreglo "));
			 System.out.print(valor1+" ");
			 arreglo_eje2[n] = valor1;
		     			 
		 }
		 for (int n=0; n<10; n+=1) {
			 valor_prom = valor_prom+arreglo_eje2[2]; 
			 if (n==9) {
				valor_prom=valor_prom%n;  //operador modulo
				System.out.println("valor promedio : "+valor_prom);
				 		
			 }
		 }
		 	 
		
		int [] arreglo_eje3 = new int [100];
		System.out.print("los numeros aleatorios son: ");
        
		for (int n=0; n<100; n+=1) {
		 int numero_aleatorio = (int) (Math.random() * 99) + 1;
         System.out.print(" "+numero_aleatorio);
         arreglo_eje3[n] =numero_aleatorio;
    	}
		for (int n=0; n<100; n+=10) {
			 System.out.println();
			for (int k=0;k<10;k+=1) {
			System.out.print(" "+arreglo_eje3[n+k]);
			}
			
	    	}
		
		
	}

}

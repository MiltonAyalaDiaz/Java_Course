package com.quantummad.Java_Course;

import javax.swing.JOptionPane;
//import java.util.*;

public class Ejercicio_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero_calcular=0;
		
	  	double resultado = 0;
	  	int i=1;
	  	
		
		
			
			numero_calcular=Integer.parseInt(JOptionPane.showInputDialog("Digita numero para calcular el factorial: "));
		
			
			System.out.println("Numero a calcular : "+numero_calcular);
			
			if (numero_calcular <0) {
				System.out.println("Numero : "+numero_calcular+"No puede ser negativo");
			}else {if (numero_calcular==0) {
				       resultado=0;
				       }else {
				    	     resultado=1;
						     for(i=1;i<=numero_calcular;i++) {
							    resultado= resultado*i;
							    System.out.println("Numero Iteraccion: "+i+"Resultado "+resultado);	
						     }
			            }
			      System.out.println("Factorial es : "+resultado);
			      
			        System.out.println("i vale : "+i);
			      }
			
		
	}

}

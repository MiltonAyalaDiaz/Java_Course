package com.quantummad.Java_Course;

import javax.swing.JOptionPane;
//import java.util.*;

public class Bucles{

	public static void main(String[] args){
		
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        
        int numero_aleatorio = (int) (Math.random() * 99) + 1;
        System.out.println("el numero aleatorio es "+numero_aleatorio);
        int contador =-1;
       
	
		boolean resultado;
		resultado = (numero_aleatorio>100);
		
		do {
			
			int numero_digitado =Integer.parseInt(JOptionPane.showInputDialog("Digita numero "));
			
		     resultado = (numero_aleatorio == numero_digitado);
		   if (! resultado) 
		     {
			    System.out.print(nombre+" El numero  "+numero_digitado+" no coincide");
			    if (numero_digitado < numero_aleatorio) 
			     {
			    	    System.out.println(nombre+"  es Menor ");
			     }else  System.out.println(nombre+"  es Mayor ");
			             
		     } 
		     contador=contador+1;
		     }while ( ! resultado);
		     
		System.out.println(" El numero aleatorio era: "+numero_aleatorio+" encontrado al "+contador+" Intento");
	}
}

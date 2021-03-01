package com.quantummad.Java_Course;

import javax.swing.*;

public class RaizScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Digita la edad "));
		System.out.println("Hola "+nombre+" La raiz de tu edad es: "+ Math.sqrt(edad));

		double base;
		base =Double.parseDouble(JOptionPane.showInputDialog("Digita la base "));
		
		double exponente;
		exponente=Double.parseDouble(JOptionPane.showInputDialog("Digita el exponente"));
    	System.out.println(base + " elevado a la  "+exponente+" es "+ Math.pow(base,exponente));

    
	}

}

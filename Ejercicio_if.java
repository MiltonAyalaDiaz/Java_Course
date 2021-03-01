package com.quantummad.Java_Course;

import javax.swing.JOptionPane;

public class Ejercicio_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double estatura;
		estatura = Double.parseDouble(JOptionPane.showInputDialog("Digita Estatura en cm "));	
		String genero=JOptionPane.showInputDialog("M for Man or W for Woman");
		
		
		if(genero=="M"){
			JOptionPane.showMessageDialog(null, "Peso ideal para "+estatura+ " cm es "+(estatura-110)+" porque eres "+genero );
			
		}else {
			System.out.println();
			JOptionPane.showMessageDialog(null, "Peso ideal para "+estatura+ " cm es "+(estatura-120)+" porque eres "+genero );
		}
			
		
		
		int hijos;
		hijos = Integer.parseInt(JOptionPane.showInputDialog("Digita Numero de hijos "));
		switch(hijos) {
		case (0):
			JOptionPane.showMessageDialog(null, "La natalidad es  baja" );
		    break;
		case (1):
			JOptionPane.showMessageDialog(null, "POr algo se empieza" );
		    break;
		default:
			JOptionPane.showMessageDialog(null, "Te pasaste" );
			
		}

		
		double salario_mayor;
		double salario1;
		salario1 = Double.parseDouble(JOptionPane.showInputDialog("Digita Salario1 "));
		double salario2;
		salario2 = Double.parseDouble(JOptionPane.showInputDialog("Digita Salario2 "));
		
		salario_mayor=(salario1>salario2)?salario1:salario2;
		JOptionPane.showMessageDialog(null, "Salario mayor es "+salario_mayor );
		   
	}

}

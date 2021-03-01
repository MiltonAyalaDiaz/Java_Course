package com.quantummad.Java_Course;
import javax.swing.*;

public class JoptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("Digita la edad "));
		System.out.println("Tu nombre es "+nombre+" y tienes "+edad);
		
		boolean mayor_edad = true;
		if (edad<18){
			mayor_edad=false;
			JOptionPane.showMessageDialog(null, "Eres menor de edad ");
		}
         // no es necesario colocar el = true
		if (mayor_edad) {
			System.out.println(" Eres mayor puedes entrar! " );
	
		}else if(mayor_edad=false) {
			System.out.println(" Eres menor de edad no puedes pasar! ");

		}
		
		double salario;
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digita salario "));
		int numero_hermanos = Integer.parseInt(JOptionPane.showInputDialog("Digita el numero de hermanos "));
		
		
		if((edad >=18) && (salario<500) && (numero_hermanos >2)){
			System.out.println("Con "+numero_hermanos+" y Salrio de "+salario+" Tienes Beca!" );
			
		}else {
			System.out.println("Con "+numero_hermanos+" hermanos y Salario de "+salario+" No tienes derecho a Beca! ");
		}
	
		if(!(edad >18 && salario<500 && numero_hermanos >2)){
			System.out.println("Con "+numero_hermanos+" y Salrio de "+salario+" Tienes Beca!" );
			
		}else {
			System.out.println("Con "+numero_hermanos+" hermanos y Salario de "+salario+" No tienes derecho a Beca! ");
		}
	
		String carnet=JOptionPane.showInputDialog("Tienes Carnet? ");
	
		if (edad>=18) {
			if(carnet.contentEquals("si")) {
				JOptionPane.showMessageDialog(null, "Puedes comprar el coche! ");
				//se pueden obviar los corchetes{} cuando en los if or else solo tienen una linea.
			}else JOptionPane.showMessageDialog(null, "Sin carnet no hay coche! ");
						
		}
		
	}
}

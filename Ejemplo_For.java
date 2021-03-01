package com.quantummad.Java_Course;

public class Ejemplo_For {

	public static void main(String[] args) {
		int i=0;
		int j=0;
		int k=0;
		
		// TODO Auto-generated method stub
		for(i=0;i<10;i+=1) {

		}
		System.out.println("Has salido del bucle a la "+i+" Iteraccion");
		
		
		for(j=0;j<10;j+=1) {
			for (k=0;k<10;k+=1) {
			 System.out.println("Hola Alumnos posicion "+j+" "+k);
			 
			 if (k==3) break;
		    }
		}
		System.out.println("Has salido del bucle en "+j+" "+k);
	}

}

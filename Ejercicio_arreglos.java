package com.quantummad.Java_Course;

import javax.swing.JOptionPane;

public class Ejercicio_arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] my_arreglo = new int [4];
		
		
		
		my_arreglo[0] = 5;
		my_arreglo[1] = 99;
		my_arreglo[2] = 21;
		my_arreglo[3] = 13;
	
		for (int i=0;i<my_arreglo.length;i++) {
			System.out.println(my_arreglo[i]);
		}
		
		int my_arreglo2[] = {5,99,21,13};
		//foreach in java does not have each word
		for (int valores:my_arreglo2) {
			System.out.println("Array2 "+valores);
			}

		String [] arreglo_nombres= {"milton","johanna","sofia","juan"};
		     for (String nombres:arreglo_nombres) {
			      System.out.println("Array_nombres "+nombres);
			     }

				for (int j=0;j<arreglo_nombres.length;j++) {
					System.out.print(arreglo_nombres[j]+" ");
				}
				
		//Array only can content one type, no mix (int or string)	
				
		//arrays bidimentional
	    System.out.println();
		int my_arreglo3 [][] = new int[2][3];
		   
		my_arreglo3[0][0] = 1;
		my_arreglo3[0][1] = 2;
		my_arreglo3[0][2] = 3;
		my_arreglo3[1][0] = 4;
		my_arreglo3[1][1] = 5;
		my_arreglo3[1][2] = 6;
		
		for (int l=0;l<2;l++) {
			 for (int m=0;m<3;m++) {
				 System.out.print(my_arreglo3[l][m]+" ");
			 }
			 System.out.println();
		 }
		
		
		   // my_arreglo3[0][0]=1;
		//int my_arreglo4 [][] = new int[2][3];
		    
		   int[][]  my_arreglo4= {{11,22,33},{44,55,66}};
		   //los aray se puieden copiar
		   int[][] my_arreglo5 = my_arreglo4;
		    
		 for (int k=0;k<2;k++) {
			 for (int z=0;z<3;z++) {
				 System.out.print(my_arreglo4[k][z]+" ");
			 }
			 System.out.println();
		 }
		 
		 
		 for(int[] dimension1:my_arreglo5) {
			 for(int dimension2:dimension1) {
				 System.out.print(dimension2+" ");
			 }
			 System.out.println();
		 }
		 
		
		 
		 //Ejercicio1 video40
		 int [] arreglo_eje1 = new int [10];
		 int valor1 = 0;
		 int valorpos=0;
		 int valorneg=0;
		 int valorcero=0;
		 for (int n=0; n<10; n+=1) {
			 valor1 =Integer.parseInt(JOptionPane.showInputDialog("Digite valor para el arreglo ")); 
			 arreglo_eje1[n] = valor1;
		     System.out.print(valor1+" ");
			   if (valor1==0) {
				     valorcero+=1;
			      }else if(valor1>0) {
				   valorpos+=1;
			       }else if(valor1<0) {
				           valorneg+=1;
			             }
				 
			 }
		 System.out.println("");
		 System.out.println("valores igual a cero:"+valorcero);
		 System.out.println("valores mayor a cero:"+valorpos);
		 System.out.println("valores menor a cero:"+valorneg);
		 
	}
}

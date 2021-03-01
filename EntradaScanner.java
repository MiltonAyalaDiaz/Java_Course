
package com.quantummad.Java_Course;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu Edad");
        int edad  =entrada.nextInt();
        
        System.out.println("Introduce Edad esposa");
        int edadEsposa  =entrada.nextInt();
        
        System.out.println("Introduce tu nombre por favor");
       
        entrada.nextLine();
        String nombre  =entrada.nextLine();
        System.out.println("Tu nombre es "+nombre+ " y tienes "+edad);
      
        System.out.println("Tu nombre es "+nombre+ " y entre los dos  tienen "+(edad+edadEsposa));
        
       
     
        
        entrada.close();
        }
}
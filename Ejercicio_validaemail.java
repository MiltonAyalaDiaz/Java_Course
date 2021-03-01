    package com.quantummad.Java_Course;

    import javax.swing.JOptionPane;
    //import java.util.*;
    
public class Ejercicio_validaemail {
	public static void main(String[] args){
		
		int myemail_size=0;
		boolean emailcorrecto=false;
		int contador_punto=0;
	  	int contador_arroba=0;
		
		
		do {
			String myemail=JOptionPane.showInputDialog("Introduce tu email");
			myemail_size = myemail.length();
			System.out.println("email  "+myemail);
       
			//String [] string_email = new String[myemail];
			if (myemail_size <4 ) {

				System.out.println("email size < 4 not valid comes with "+myemail_size+" chars");
				
        	
			}else {
				  	int i = 0;
				  	contador_punto = 0;
				  	contador_arroba = 0;
				  	
				  	String char_dot = ".";
				  	String char_at = "@;";
				  	for(i=0;i<=myemail_size;i++) {
				  		
				  		if (myemail.regionMatches(i,char_dot,0,1) ) { 	
				  			contador_punto++; 		
				  			}
				  		if (myemail.regionMatches(i,char_at,0,1) ) { 	
				  			contador_arroba++; 		
				  			}
				  		
				  		System.out.println("email size > 4 good, size: "+myemail_size);
				  		System.out.println("Contador punto: "+contador_punto);
				  		System.out.println("Contador arroba: "+contador_arroba);
				  	}
				  	 if (contador_punto > 1) { break;
					 
					 }
					 else {if(contador_arroba > 1) {break;
					 
					 		  }  else { if (contador_punto == 1 && contador_arroba == 1 ) {
					    	    	 emailcorrecto=true;
						       		 System.out.println("Correo es correcto ");	 
						       		 
					    	     
					       		}
					       }
					 }
				  }
			
			} while( ! emailcorrecto);
        
   }
}
package com.quantummad.Java_Course;

public class Vehiculos {

	 public Vehiculos() 	 { //Constructor de la clase. Mismo nombre de la clase.
		 ruedas =4;
		 largo=2;
		 ancho=1;
		 peso=2;
		 color="sin color";
		 
	 }
/*	 public void setColor() {//metodo setter establece valor de propiedad
		                     //el void no hace return
		 color="azul";
	 }
	 */
	 
	 public void setColor(String color) {//metodo setter establece valor de propiedad
         //el void no hace return
         this.color=color;  //el this se coloca a la propiedad de la clase 
                                   // para diferenciarla del parametro
     }
 
	 public String getColor() {//metodo getter que devuelve valor de propiedad
		return color; 
	 }
	 
	 private int ruedas;
	 private String color;
	 private int largo;
	 private int peso;
	 private int ancho;
	 
}

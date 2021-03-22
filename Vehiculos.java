package com.quantummad.Java_Course;

public class Vehiculos {

	 public Vehiculos(int ruedas) 	 { //Constructor de la clase. Mismo nombre de la clase.
		 this.ruedas =ruedas;
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
	 public void setExtra(boolean climatizador) {
		 this.climatizador = climatizador;
	 }
	 
	 public void setExtra(boolean gps, boolean climatizador, boolean tapiceria_cuero) {
	        this.gps = gps;
	        this.climatizador=climatizador;
	        this.tapiceria_cuero = tapiceria_cuero;
	 }
	 
	 public void setColor(String color) {//metodo setter establece valor de propiedad
         //el void no hace return
         this.color=color;  //el this se coloca a la propiedad de la clase 
                                   // para diferenciarla del parametro
     }
 
	 public String getColor() {//metodo getter que devuelve valor de propiedad
		return "Elcolor del vehiculo es: "+color; 
	 }
	 
	 public String getExtraClimatizador() {
		// return climatizador;
		 if (climatizador == true) return " tiene climatizador";
		 else return " no tiene climatizador";
	 }
	 
	 public String getExtraGps() {
			// return climatizador;
			 if (gps == true) return " tiene GPS";
			 else return " no tiene GPS";
		 }
	 
	 public String getExtraTapiceria_cuero() {
			// return climatizador;
			 if (tapiceria_cuero == true) return " tiene Tapiceria Cuero";
			 else return " no tiene Tapiceria cuero";
		 }
	 
	 public String getDatosVehiculo() {
		 return " tiene "+ruedas+" ruedas. ademas ";
		 
	 }
	 
	 private int ruedas;
	 private String color;
	 private int largo;
	 private int peso;
	 private int ancho;
	 private  boolean climatizador;
	 private boolean tapiceria_cuero;
	 private boolean gps;
	 
	 
}

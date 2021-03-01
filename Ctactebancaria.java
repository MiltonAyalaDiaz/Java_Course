package com.quantummad.Java_Course;

public class Ctactebancaria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		saldo =4;
		nombreTitular=2;
		numero_Cuenta=1;
		peso=2;
		color="sin color";
	}
	private int saldo;
	private String nombreTitular;
	private int numero_cuenta;
	private int peso;
	private String color;


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


}

package com.quantummad.Java_Course;
import java.util.Random;

public class Ctactebancaria {

	public Ctactebancaria(String nombreTitular, double saldo) {
		// TODO Auto-generated method stub
		this.saldo = saldo;   
		         //el this se coloca a la propiedad de la clase 
                 // para diferenciarla del parametro

		this.nombreTitular=nombreTitular;
		Random rnd=new Random();
		numeroCuenta=Math.abs(rnd.nextLong());
	}
	
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public void setIngreso(double ingreso) {//metodo setter establece valor de propiedad
											//el void no hace return
		if (ingreso<0) System.out.println("No s permiten ingresos negtivos");
		else saldo+=ingreso;
	}

	public void setReintregro(double reintegro) {//metodo setter establece valor de propiedad
           saldo-=reintegro; 
    }
 
	public String getSaldo() {//metodo para retornar el saldo 
		return "El saldo de la cuenta es:"+ saldo;
	}

	public static void Transferencia(Ctactebancaria titu1, Ctactebancaria titu2, double cantidad) {
		titu1.saldo=titu1.saldo-cantidad;
		titu2.saldo=titu2.saldo+cantidad;
	}
 
	public String getDatosCuenta() {
		return "Titular: "+ nombreTitular + "\n"+
	    "No de Cuenta: " + numeroCuenta + "\n"+
				"Saldo: "+saldo;
	}
	
	
}

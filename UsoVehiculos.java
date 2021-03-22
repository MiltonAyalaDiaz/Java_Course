package com.quantummad.Java_Course;

public class UsoVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehiculos miCoche1=new Vehiculos(4);    //instancia la clase vehiculos
        miCoche1.setColor("verde");
       // System.out.println("El primer coche tienen color: "+miCoche.getColor());//se trae el metodo getcolor de la clase
        miCoche1.setExtra(false,false,true);
        Vehiculos miCoche2=new Vehiculos(4);    //instancia la clase vehiculos
        miCoche2.setColor("amarillo");
        //System.out.println("El segundo coche tiene color:"+miCoche2.getColor());//se trae el metodo getcolor de la clase
        
        miCoche2.setExtra(true,false,true);
        
        //System.out.println(miCoche2.getExtra()); 
        
        Vehiculos moto1=new Vehiculos(2);
        moto1.setExtra(false,true,false);
        System.out.println(miCoche1.getColor()+miCoche1.getDatosVehiculo()+miCoche1.getExtraClimatizador());
        System.out.println(miCoche2.getColor()+miCoche2.getDatosVehiculo()+miCoche2.getExtraClimatizador());
        System.out.println(moto1.getColor()+moto1.getDatosVehiculo()+moto1.getExtraClimatizador());
        
	}

}

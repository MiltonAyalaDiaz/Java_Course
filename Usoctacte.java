package com.quantummad.Java_Course;

public class Usoctacte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ctactebancaria Cuenta1=new Ctactebancaria("Milton Ayala",1500);    //instancia la clase vehiculos
        Ctactebancaria Cuenta2=new Ctactebancaria("Johanna Mora",2000);    //instancia la clase vehiculos
        System.out.println(Cuenta1.getDatosCuenta());//se trae el metodo getcolor de la clase
        System.out.println(Cuenta2.getDatosCuenta());
        Ctactebancaria .Transferencia(Cuenta1,Cuenta2, 200);
        System.out.println(Cuenta1.getDatosCuenta());//se trae el metodo getcolor de la clase
        System.out.println(Cuenta2.getDatosCuenta());
   }
}

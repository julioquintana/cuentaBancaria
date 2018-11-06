package com.ejemplos.cuenta;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta c1 = new Cuenta("Julio Quintana");
		System.out.println(c1);
		c1.ingresar(1500.89);
		System.out.println(c1);
		c1.ingresar(300);
		System.out.println(c1);
		c1.retirar(300);
		System.out.println(c1);
		
	}

}

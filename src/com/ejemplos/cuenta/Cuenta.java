package com.ejemplos.cuenta;

public class Cuenta implements Cuentas {
	String titular;
	double saldo;
	
	Cuenta(String titular){
		this.titular = titular;
		this.saldo=0;
	}
	Cuenta(String titular, double cuenta){
		this.titular = titular;
		this.saldo=cuenta;
	}
	@Override
	public double ingresar(double monto) {
		if(monto > 0) {
			this.saldo += monto;
			System.out.println("Se efectuo ingreso de " + monto +" (saldo disponible"+getSaldo()+")");
		}
		return getSaldo();
	}
	@Override
	public double retirar(double monto) {
		if ((this.saldo - monto) < 0) {
			setSaldo(0);
		}else {
			this.saldo -= monto;
			System.out.println("Se efectuo retiro de " + monto+"(saldo disponible"+getSaldo()+")");
		}
		return getSaldo();
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String toString() {
		return "Titular: "+ getTitular()+" Saldo: "+getSaldo();
	}
	
}

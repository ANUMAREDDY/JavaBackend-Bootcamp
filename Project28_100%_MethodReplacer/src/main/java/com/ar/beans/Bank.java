package com.ar.beans;

public class Bank {
	
	public double calculateIntrestAmount(double pamt, double rate, double time) {
		System.out.println("Bank.calculateintrestAmount()");
		return (pamt*Math.pow(1+rate/100,time))-pamt;
	}

}

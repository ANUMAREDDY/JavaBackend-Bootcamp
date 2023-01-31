package com.ar.beans;

public class B {
private A a;

public B() {
	super();
	System.out.println("Constructor of B");
}

public void setA(A a) {
	System.out.println("set B");
	this.a = a;
}

@Override
public String toString() {
	return "from B";
}



}

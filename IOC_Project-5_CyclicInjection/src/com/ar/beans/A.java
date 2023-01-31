package com.ar.beans;


public class A {
private B b;

public A(){
	System.out.println("Constructor of A");
}

public void setB(B b) {
	System.out.println("set A");
	this.b = b;
}

@Override
public String toString() {
	return "from A";
}

}

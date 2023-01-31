package com.ar.comp;

public class SmartRemote extends Socket {
private int Remoteid;
private Radiation radiation;

public SmartRemote(Radiation radiation) {
	System.out.println("Initializing smart remote radiation:: 1-param constructor");
	this.radiation=radiation;
}
@Override
public void changeChannel() {
	System.out.println("Chnaging channel using Smart remote"+radiation);
	
}
	
	

}

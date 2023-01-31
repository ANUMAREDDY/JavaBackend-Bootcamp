package com.ar.factory;

import com.ar.comp.Radiation;
import com.ar.comp.Socket;
import com.ar.comp.RegularRemote;
import com.ar.comp.SmartRemote;

public class SocketFactory {
	
private Radiation radiation;
private static Socket soc=null;

public static Socket getSignal(String type) {
	
	Radiation rad= new Radiation();
	
	if(type.equalsIgnoreCase("smart"))
		soc= new SmartRemote(rad);
	else if(type.equalsIgnoreCase("regular"))
		soc= new RegularRemote(rad);
	else
		throw new IllegalArgumentException("invalid person");
	
	return soc;
}


}

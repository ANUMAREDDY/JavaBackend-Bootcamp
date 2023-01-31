package com.ar.test;

import com.ar.comp.Radiation;
import com.ar.comp.SmartRemote;
import com.ar.comp.Socket;
import com.ar.factory.SocketFactory;

public class SmartUser {

	public static void main(String[] args) {
		
		Socket soc = SocketFactory.getSignal("smart");
		soc.changeChannel();
		
		
		

	}

}

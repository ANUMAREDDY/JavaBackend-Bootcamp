package com.ar.test;
import com.ar.comp.Radiation;
import com.ar.comp.SmartRemote;
import com.ar.comp.Socket;
import com.ar.factory.SocketFactory;


public class User {

	public static void main(String[] args) {
				
		Socket soc = SocketFactory.getSignal("regular");
		soc.changeChannel();
				
				
				

			}


	}


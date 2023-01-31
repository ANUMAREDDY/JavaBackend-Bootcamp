package com.ar.comp;

public class RegularRemote extends Socket {
	private int RegularRemoteid;
	private Radiation radiation;

	public RegularRemote(Radiation radiation) {
		System.out.println("Initializing smart remote radiation:: 1-param constructor");
		this.radiation=radiation;
	}
	@Override
	public void changeChannel() {
		System.out.println("Chnaging channel using Smart remote"+radiation);
		
	}


}

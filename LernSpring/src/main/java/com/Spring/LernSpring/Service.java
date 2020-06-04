package com.Spring.LernSpring;

public class Service {

	BulbStruture bulbStruture;

	public BulbStruture getBulbStruture() {
		return bulbStruture;
	}

	public void setBulbStruture(BulbStruture bulbStruture) {
		this.bulbStruture = bulbStruture;
	}

	public String beginApplication() {
		String on = bulbStruture.on();
		String off = bulbStruture.off();

		return on + " " + off;
	}

}

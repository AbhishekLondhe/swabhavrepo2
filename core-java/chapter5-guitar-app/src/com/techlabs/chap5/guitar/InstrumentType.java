package com.techlabs.chap5.guitar;

public enum InstrumentType {
	GUITAR,BANJO,MANDOLIN,DOBRO,BASS,FIDDLE;
	public String toString() {
		switch(this) {
		case GUITAR:return "guitar";
		case BANJO:return "banjo";
		case MANDOLIN:return "mandolin";
		case DOBRO: return "dobro";
		case BASS:return "bass";
		case FIDDLE:return "fiddle";
		default: return "unspecified";
		}
	}
}

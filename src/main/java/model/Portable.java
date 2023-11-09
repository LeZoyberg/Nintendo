package model;

public class Portable extends Console {

	public Portable(String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return "Portable [getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

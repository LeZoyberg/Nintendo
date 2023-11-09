package model;

public class Salon extends Console {

	public Salon(String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return "Salon [getNom()=" + getNom() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

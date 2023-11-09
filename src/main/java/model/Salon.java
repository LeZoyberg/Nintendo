package model;

import java.time.LocalDate;

public class Salon extends Console {

	public Salon(String nom, LocalDate dateSortie, double prix) {
		super(nom, dateSortie, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Salon [nom=" + nom + ", dateSortie=" + dateSortie + ", prix=" + prix + "]";
	}
}

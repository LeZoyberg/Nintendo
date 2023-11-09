package model;

import java.time.LocalDate;

public class Portable extends Console {

	public Portable(String nom, LocalDate dateSortie, double prix) {
		super(nom, dateSortie, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Portable [nom=" + nom + ", dateSortie=" + dateSortie + ", prix=" + prix + "]";
	}
	
}

package model;

import java.time.LocalDate;

public class Hybride extends Console {


	public Hybride(String nom, LocalDate dateSortie, double prix) {
		super(nom, dateSortie, prix);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hybride [nom=" + nom + ", dateSortie=" + dateSortie + ", prix=" + prix + "]";
	}


	
}

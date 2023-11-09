package model;
import java.time.LocalDate;

public abstract class Console {

	protected String nom;
	protected LocalDate dateSortie ; 
	protected double prix ; 

	public Console(String nom, LocalDate dateSortie, double prix) {
		super();
		this.nom = nom;
		this.dateSortie = dateSortie;
		this.prix = prix;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public LocalDate getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(LocalDate dateSortie) {
		this.dateSortie = dateSortie;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Console [nom=" + nom + ", dateSortie=" + dateSortie + ", prix=" + prix + "]";
	}
}

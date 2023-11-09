package test;

import java.time.LocalDate;

import model.Achat;
import model.Boutique;
import model.Console;
import model.Hybride;
import model.Jeu;
import model.Salon;
import model.Client;

public class Test {


	public static void main(String[] args) {

	Salon Nintendo64 = new Salon("Nintendo64",LocalDate.parse("1996-06-23"),20.0);	
	Salon Wii = new Salon("Wii",LocalDate.parse("2006-11-19"),30.0);
	Hybride Switch = new Hybride("Switch",LocalDate.parse("2017-03-03"),150.0);
	Client c1 = new Client("ali","baba");
	Client c2 = new Client("élé","40Voleur");
	Boutique b1 = new Boutique("Melee Boutique", "55 Rue de Luigi") ;
	Jeu j1 = new Jeu("SuperMario64",Nintendo64,b1);
	Jeu j2 = new Jeu("MarioParty",Nintendo64,b1);
	Jeu j3 = new Jeu("Animal Crossing",Switch,b1);
	Jeu j4 = new Jeu("Wii Sport",Wii,b1);
	Jeu j5 = new Jeu("Pokemon Stadium",Nintendo64,b1);
	
	Achat a1 = new Achat(j5,LocalDate.now(),1.0);
	c1.getAchats().add(a1);

	System.out.println(c1);
	}
}

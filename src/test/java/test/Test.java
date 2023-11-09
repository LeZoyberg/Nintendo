package test;

import java.time.LocalDate;

import model.Achat;
import model.Boutique;
import model.Console;
import model.Jeu;
import model.Client;

public class Test {


	public static void main(String[] args) {
		
	Console Nintendo64 = new Console("Nintendo64");	
	Console Wii = new Console("Wii");
	Console Switch = new Console("Switch");
	Client c1 = new Client("ali","baba");
	Client c2 = new Client("élé","40Voleur");
	Boutique b1 = new Boutique("Melee Boutique", "55 Rue de Luigi") ; 
	Jeu j1 = new Jeu("SuperMario64",Nintendo64,b1);
	Jeu j2 = new Jeu("MarioParty",Nintendo64,b1);
	Jeu j3 = new Jeu("Animal Crossing",Switch,b1);
	Jeu j4 = new Jeu("Wii Sport",Wii,b1);
	Jeu j5 = new Jeu("Pokemon Stadium",Nintendo64,b1);
	//c1.getAchats().add(j5,LocalDate.now(),1.0);
	}

}

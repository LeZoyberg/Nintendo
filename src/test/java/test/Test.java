package test;

import model.Console;
import model.Jeu;
import model.Client;
public class Test {

	
	public static void main(String[] args) {
	Console Nintendo64 = new Console("Nintendo64");	
	Console Wii = new Console("Wii");
	Console Switch = new Console("Switch");
	Jeu j1 = new Jeu("SuperMario64",Nintendo64);
	Jeu j2 = new Jeu("MarioParty",Nintendo64);
	Jeu j3 = new Jeu("Animal Crossing",Switch);
	Jeu j4 = new Jeu("Wii Sport",Wii);
	Jeu j5 = new Jeu("Pokemon Stadium",Nintendo64);
	Client c1 = new Client("ali","baba");
	Client c2 = new Client("élé","40Voleur");
	
	
	}

}

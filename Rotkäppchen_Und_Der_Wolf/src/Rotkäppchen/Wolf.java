package Rotk�ppchen;

import basis.*;

public class Wolf extends Waldbewohner {

	/** 
	* Klasse Konstruktor erweitertet der Waldbewohner. Setz Farbe der Stift auf Schwarz f�r Klasse Wolf 
	* @param pGeschw Geschwindigkeit wie schnell der Wolf pro Zeiteinheit bewegen kann
	* @param pBildschirm Oberfl�che f�r Wolf
	* @see Waldbewohner   
	*/
	
	public Wolf(double pGeschw, Fenster pBildschirm) {
		super(pGeschw, pBildschirm);
		hatStift.setzeFarbe(Farbe.SCHWARZ);
	}

	
	
	public void bewege() {
		
		hatStift.dreheInRichtung(xR, yR); // dreht sich in Rotk�ppchens-Richtung
		vermeidenHindernis();
		hatStift.bewegeUm(zGeschwindigkeit);

	}

}

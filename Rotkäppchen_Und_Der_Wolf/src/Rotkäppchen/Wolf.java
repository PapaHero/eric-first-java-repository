package Rotkšppchen;

import basis.*;

public class Wolf extends Waldbewohner {

	// Konstruktor
	public Wolf(double pGeschw, Fenster pBildschirm) {
		super(pGeschw, pBildschirm);
		hatStift.setzeFarbe(Farbe.SCHWARZ);
	}

	public void bewege() {
		
		
		hatStift.dreheInRichtung(xR, yR); // dreht sich in Rotkšppchens-Richtung
		vermeidenHindernis();
		hatStift.bewegeUm(zGeschwindigkeit);

	}

}

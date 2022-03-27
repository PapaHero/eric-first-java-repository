package Rotkäppchen;

import basis.*;

public abstract class Waldbewohner {

	Stift hatStift;
	Fenster kenntBildschirm;
	Waldbewohner enemy;
	Tastatur taste;

	// Attribute
	double zAbstand;
	double zGeschwindigkeit;
	double xR;
	double yR; // Zwischenspeicher für Rotkäppchen position

	// Konstruktor
	public Waldbewohner(double pGeschw, Fenster pBildschirm) {
		kenntBildschirm = pBildschirm;
		taste = new Tastatur();
		hatStift = new Stift();
		hatStift.bewegeBis(Hilfe.zufall(10, kenntBildschirm.breite() - 10),
				Hilfe.zufall(10, kenntBildschirm.hoehe() - 10));
		// Startpunkt
		hatStift.runter();
		zGeschwindigkeit = pGeschw;
//		hatStift.setzeFarbe(Farbe.SCHWARZ); Farbe wird in den Unterklassen festgelegt

	}

	public void lerneKennen(Waldbewohner waldi) { // Dynamisches lerneKennen
		this.enemy = waldi;
		zAbstand = this.abstand();
	}

	public void gibFrei() {
		hatStift.gibFrei();
	}

	public boolean vermeidenHindernis() {
		if (this.amLinkenRand()) {
			hatStift.dreheBis(0);
			return true;
		} else if (this.amRechtenRand()) {
			hatStift.dreheBis(180);
			return true;
		} else if (this.amOberenRand()) {
			hatStift.dreheBis(-90);
			return true;
		} else if (this.amUnterenRand()) {
			hatStift.dreheBis(90);
			return true;
		}
		return false;
	}

	protected boolean amLinkenRand() {
		return hatStift.hPosition() < 10;
	}

	protected boolean amRechtenRand() {
		return hatStift.hPosition() > kenntBildschirm.breite() - 10;
	}

	protected boolean amOberenRand() {
		return hatStift.vPosition() < 10;
	}

	protected boolean amUnterenRand() {
		return hatStift.vPosition() > kenntBildschirm.hoehe() - 10;
	}

	public double hPosition() {
		return hatStift.hPosition();
	}

	public double vPosition() {
		return hatStift.vPosition();
	}

	public double abstand() {
		double x_w, y_w, // Wolfkoordinaten
				x_r, y_r, // Rotkaeppchenkoordinaten
				d; // Abstand mit Pythagoras berechnet
		x_w = hatStift.hPosition();
		y_w = hatStift.vPosition();
		x_r = enemy.hPosition();
		xR = x_r; // x wird abgespeichert
		y_r = enemy.vPosition();
		yR = y_r; // y wird abgespeichert
		d = Hilfe.wurzel(Hilfe.quadrat(x_r - x_w) + Hilfe.quadrat(y_r - y_w));
		return d;
	}
	
	public void dreheBis(int px) {
		hatStift.bewegeUm(zGeschwindigkeit* px);
	}
	
	public void dreheUm(double px) {
		hatStift.dreheUm(px);		
		hatStift.bewegeUm(zGeschwindigkeit);
	}
	

	public abstract void bewege(); // Wird von Unterklassen ausgeprägt
}

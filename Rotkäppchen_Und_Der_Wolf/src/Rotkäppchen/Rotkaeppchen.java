package Rotkäppchen;

import basis.*;

public class Rotkaeppchen extends Waldbewohner {

	public Rotkaeppchen(double pGeschw, Fenster pBildschirm) {
		super(pGeschw, pBildschirm);
		hatStift.setzeFarbe(Farbe.ROT);
		hatStift.zeichneKreis(2);
		hatStift.dreheInRichtung(xR, yR);
		hatStift.dreheUm(180);
	}

//    public void lerneKennen(Wolf wolf)
//    {
//      wolf = meinWolf;
//      zAbstand = this.abstand();
//    }
	public void bewege() // Funktion zum bewegen
	{

		if (vermeidenHindernis()) {
//			hatStift.dreheInRichtung(xR, yR);
//			hatStift.dreheUm(180);
//			System.out.println("Drehen");
		}
		if (taste.wurdeGedrueckt()) {

			switch (taste.zeichen()) {
			case 'w':
				this.dreheUm(10);
				break;
			case 'a':
				this.dreheBis(1);
				break;
			case 's':
				this.dreheBis(-1);
				break;
			case 'd':
				this.dreheUm(-10);
				break;

			}
		} else {
			hatStift.bewegeUm(zGeschwindigkeit);
		}

	}

}

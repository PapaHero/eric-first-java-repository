package Rotk�ppchen;

import basis.Farbe;
import basis.Fenster;
import basis.Hilfe;
import basis.Stift;

public class Gro�mutter {

	Fenster kenntBildschirm;
	Stift hatStift;
	
	public Gro�mutter(Fenster pBildschirm) {
		this.kenntBildschirm = pBildschirm;
		hatStift = new Stift();
		hatStift.bewegeBis(Hilfe.zufall(10, kenntBildschirm.breite() - 50),
				Hilfe.zufall(10, kenntBildschirm.hoehe() - 50));
		// Startpunkt f�r Hause
		hatStift.runter();
		hatStift.setzeFarbe(Farbe.ROT); // male rot H�uschen		
		
	}
}

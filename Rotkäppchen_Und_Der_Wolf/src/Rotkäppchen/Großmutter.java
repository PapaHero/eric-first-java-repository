package Rotkäppchen;

import basis.Farbe;
import basis.Fenster;
import basis.Hilfe;
import basis.Stift;

public class Großmutter {

	Fenster kenntBildschirm;
	Stift hatStift;
	
	public Großmutter(Fenster pBildschirm) {
		this.kenntBildschirm = pBildschirm;
		hatStift = new Stift();
		hatStift.bewegeBis(Hilfe.zufall(10, kenntBildschirm.breite() - 50),
				Hilfe.zufall(10, kenntBildschirm.hoehe() - 50));
		// Startpunkt für Hause
		hatStift.runter();
		hatStift.setzeFarbe(Farbe.ROT); // male rot Häuschen		
		
	}
}

package Rotkäppchen;
import basis.*;

public class MeinProgramm {

    Fenster derBildschirm; 
    Maus dieMaus;
    Wolf meinWolf;
    Rotkaeppchen meinRotkaeppchen;
    Tastatur taste;
    
    // Konstruktor
    public MeinProgramm()
    {
        taste = new Tastatur();
    	derBildschirm    = new Fenster(800, 600); // Bildschirm Größe
        dieMaus          = new Maus(); // Maus wird kreirt
        meinRotkaeppchen = new Rotkaeppchen(7, derBildschirm); // erzeuge des rotkäppchen mit der Geschwindigkeit 7
        meinWolf         = new Wolf(7, derBildschirm);//erzeugt den wolf mit der geschwindigkeit 7
        meinWolf.lerneKennen(meinRotkaeppchen);//Wolf und Rotkäppchen kennen
        //this.fuehreAus();
    }
    
    public void fuehreAus() // wird ausgeführt
    {
        do
        {
        	
        	Hilfe.pause(100);
            meinRotkaeppchen.bewege();
            meinWolf.bewege();
            if(meinWolf.abstand()<10)
            {
            	return;
            }

        } while (!dieMaus.istGedrueckt()); //solange Maus nicht gedrückt wird
        
        // Aufraeumen
        meinRotkaeppchen.gibFrei();
        meinWolf.gibFrei();
        dieMaus.gibFrei();
        derBildschirm.gibFrei();
        }
    
}
   


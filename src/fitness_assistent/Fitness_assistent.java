package fitness_assistent;

import java.util.Scanner;

public class Fitness_assistent {

	public static void main(String[] args) {
		// Hier startet der Fitness-Assistent
		
	//(1) Begrüßung und Programmerklärung
	System.out.println("Hallo, ich bin dein Fitnessassistent. Wie heißt du?");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.nextLine();
	System.out.println("");
	System.out.println("Hey "+name+", hier kannst du deinen BMI (Body-Mass-Index) berechnen. Für die Berechnung benötige ich zunächst ein paar Daten.");
		
	//(2) Abfrage Größe
	System.out.println("Wie größ bist du? (Gib deine Größe in m an)");
		
	//(2) Variablen deklarieren
    double größe_double;
    String größe;
		
	//(2) Try/catch Eingabevalidierung
	try
	{
		größe = scanner.nextLine();//scannen
		
	    if (größe.contains(" m"))//if else Anweisung wenn Eingabe Maßeinheit + Leerzeichen beinhaltet
	    { größe = größe.replace(" m","");//Maßeinheit entfernen
	      größe = größe.toUpperCase();//Wert nach Entfernung der Maßeinheit neu zuweisen
	    	}
	
	    else
	    { größe = größe.replace("m","");
	      größe = größe.toUpperCase();}
	      	

	    if (größe.contains(","))
    	{ größe = größe.replace(",",".");
    	größe = größe.toUpperCase();}
	    
	    größe_double = Double.parseDouble(größe);//Datentyp String in Double umrechnen
    }
	
	catch (java.lang.NumberFormatException exception_2)//Fehlermeldung abfangen bei fehlerhafter Eingabe
    { 
		System.out.println("[ Meldung: Bitte gib deine Größe als Zahlenwert in m (z.B 1.64m) an ]");
	    größe = scanner.nextLine();
	    
	     if (größe.contains(" m"))//If Anweisung wenn Maßeinheit mit angegeben wurde + Leerzeichen
	       { größe = größe.replace(" m","");//Maßeinheit und Leerzeichen Löschen
	       größe = größe.toUpperCase();}//Variable neu zuordnen
	    
	     else
	       { größe = größe.replace("m","");//Maßeinheit löschen
	       größe = größe.toUpperCase();}//Variable neu zuordnen
	     
	     if (größe.contains(","))//wenn Komma eingegeben ist
	    	{ größe = größe.replace(",",".");//Komma durch Punkt ersetzen
	    	größe = größe.toUpperCase();}//Variable neu zuordnen
	    
	       größe_double = Double.parseDouble(größe);//Datentyp String zu Double umwandeln
	 }
	
	
	//(3) Abfrage Gewicht
	System.out.println("");
	System.out.println("Wieviel wiegst du? (Gib dein Gewicht in kg an)");
	
	//(3) Variable deklarieren
	double gewicht_double;
	String gewicht;
	
	//(3) Try/Catch Eingabevalidierung
	try 
	{
		gewicht = scanner.nextLine();//scannen
		
		if (gewicht.contains(" kg"))//if else Anweisung wenn Maßeinheit mit Leerzeichen oder/und Komma statt Punkt eingegeben ist
		{gewicht = gewicht.replace(" kg","");//Maßeinheit löschen
		gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
			
		else
		{ gewicht = gewicht.replace("kg","");//Wenn Maßeinheit ohne Leerzeichen oder/und Komma statt Punkt eingegeben ist/Maßeinheit löschen
		gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
			
		if (gewicht.contains(","))//wenn Komma eingegeben ist
			{gewicht = gewicht.replace(",",".");//Komma durch Punkt ersetzen
			gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
		
		gewicht_double = Double.parseDouble(gewicht);//Datentyp String zu Double umwandeln
    }
	
	catch (java.lang.NumberFormatException exception_3)
	{
		System.out.println("[ Meldung: Bitte gib dein Gewicht in kg (z.B 65,5 kg) an ]");//Meldung wenn Eingabe keinen Zahlenwert beinhaltet
		gewicht = scanner.nextLine();
		
		if (gewicht.contains(" kg"))//if else Anweisung wenn Maßeinheit mit Leerzeichen oder/und Komma statt Punkt eingegeben ist
		{gewicht = gewicht.replace(" kg","");//Maßeinheit löschen
		gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
		
		else
		{ gewicht = gewicht.replace("kg","");//Wenn Maßeinheit ohne Leerzeichen angegeben wurde
		gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
			
		if (gewicht.contains(","))//Wenn Komma statt Punkt eingegeben wurde
		{gewicht = gewicht.replace(",",".");//Komma durch Punkt ersetzen
		gewicht = gewicht.toUpperCase();}//Variable neu zuordnen
		gewicht_double = Double.parseDouble(gewicht);
	}
		
	
	//(4) Abfrage Alter                                !Eingabevalidierung bearbeiten!
	System.out.println("");
	System.out.println("Wie alt bist du? (Runde dein Alter auf eine ganze Zahl auf)");
	int alter = scanner.nextInt();
	
	//(4) Scanner leeren
	scanner.nextLine();
	
	//(5) Info
	System.out.println("");
	System.out.println("      [ INFO ]");
	System.out.println("");
	System.out.println("      Der BMI wird je nach Geschlecht und Alter unterschiedlich weiterverarbeitet.");
	System.out.println("      z.B. besitzen Menschen die als Mann geboren wurden häufiger einen höheren Muskelanteil im Vergleich zu Menschen, die als Frau geboren wurden.");
	System.out.println("      Auch ändert sich z.B die Körperzusammensetzung im Laufe der Zeit wenn ein Mensch eine geschlechtsangleichende Hormontherapie (HRT) durchführt.");
	System.out.println("      Es gibt darüber hinaus weitere Faktoren, die den BMI beeinflussen (z.B Amputationen einzelner Gliedmaßen).");
	System.out.println("");
	System.out.println("      Generell dient der BMI als grober Richtwert, da die Körperzusammensetzung von Muskulatur und Fettmasse von Mensch zu Mensch verschieden ist.");
	System.out.println("");
	
	//(5) Frage nach m/w/d
	System.out.println("");
	System.out.println("Was möchtest du für die Auswertung angeben?");
	System.out.println("Folgende Auswahlmöglichkeiten hast du:");
	System.out.println("");
	System.out.println("m steht für männlich");
	System.out.println("w steht für weiblich");
	System.out.println("d steht für divers");
	System.out.println("");
	System.out.println("Bitte gib jetzt den für dich passenden Buchstaben ein:");
	
	//(5) Variable deklarieren
	String geschlecht;
	
	//(5) Antwort scannen
	geschlecht = scanner.nextLine();
	
	//(5) if else Anweisung für die Wertezuweisung        !Eingabevalidierung verbessern!
	if (geschlecht.equalsIgnoreCase("m"))
	{geschlecht = "männlich";}
	else if (geschlecht.equalsIgnoreCase("w"))
	{geschlecht = "weiblich";}
	else 
	{geschlecht = "divers";}
	
	//(6) Auswertung 
	System.out.println("");
	System.out.println("Danke für deine Angaben.");
	System.out.println("Nachfolgend siehst du deine Körperwerte und den daraus resultierenden BMI (Body-Mass-Index)");
	System.out.println("");
	System.out.println("                  Name       : "+name);
	System.out.println("                  Alter      : "+alter+" Jahre");
	System.out.println("                  Größe      : "+größe_double+" m");
	System.out.println("                  Gewicht    : "+gewicht_double+" kg");
	System.out.println("                  Geschlecht : "+geschlecht);
	System.out.println("");
	System.out.println("");
	
	
	
	//(7) BMI berechnen
	double bmi;
	bmi = gewicht_double/(größe_double*größe_double);
	bmi = Math.round(bmi*100.0)/100.0;//Auf eine Nachkommastellen runden. Daher 10.0 (Bei zwei Nachkommastelle 100/bei drei Nachkommastellen 1000...u.s.w)
	
	
	//(8) if else Anweisung für die Auswertung je nach m/w/d Eingabe
	if (geschlecht.equalsIgnoreCase("männlich"))
	{
	
		//BMI Wert zuordnen
		String einordnung;
	
		if (bmi<20)
		{ einordnung = " → Untergewicht";}
	
		else if (bmi>=20.0&&bmi<=25.9)
		{ einordnung = " → Normalgewicht";}
	
		else if (bmi>=25.91&&bmi<=30.0)
		{ einordnung = " → Übergewicht";}
	
		else 
		{ einordnung = " → Adipositas";}
	
		//Ergebnis ausgeben
		System.out.println("               Dein BMI beträgt : "+bmi+einordnung);
		System.out.println("");
		System.out.println("");
	
		//Gewichtsklassen berechnen
	
		double größe_double_2 = größe_double*größe_double;//größe mal größe vorgerechnet um Formel nachfolgend zu kürzen
		
	
		
		double bmi_normalgewicht_u = 20.0*größe_double_2;//Berechnung unterer Wert für Normalgewicht
		bmi_normalgewicht_u = Math.round(bmi_normalgewicht_u*10.0)/10.0;//Rundung auf eine Nachkommastelle
	
		double bmi_normalgewicht_o = 25.0*größe_double_2;//Berechnung oberer Wert für Normalgewicht
		bmi_normalgewicht_o = Math.round(bmi_normalgewicht_o*10.0)/10.0;
	
		double bmi_übergewicht_u = 25.01*größe_double_2;//Rundungsfehler behoben (300g vorher da 25.1 angegeben war) Berechnung unterer Wert Übergewicht
		bmi_übergewicht_u = Math.round(bmi_übergewicht_u*10.0)/10.0;
	
		double bmi_übergewicht_o = 30.0*größe_double_2;//Berechnung oberer Wert Übergewicht
		bmi_übergewicht_o = Math.round(bmi_übergewicht_o*10.0)/10.0;
	
		
	
	
		//Tabelle BMI ausgeben
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            KATEGORIE                    GEWICHT                 ");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            Untergewicht       ⁞ unter "+bmi_normalgewicht_u+" kg");
		System.out.println("            Normalgewicht      ⁞ von   "+bmi_normalgewicht_u+" - "+bmi_normalgewicht_o+" kg");
		System.out.println("            Übergewicht        ⁞ von   "+bmi_übergewicht_u+" - "+bmi_übergewicht_o+" kg");
		System.out.println("            Adipositas         ⁞ über  "+bmi_übergewicht_o+" kg");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
	}
	
	else if (geschlecht.equalsIgnoreCase("weiblich"))
	{  
		//BMI Wert zuordnen
		String einordnung;
			
		if (bmi<19)
		{ einordnung = " → Untergewicht";}
			
		else if (bmi>=19.0&&bmi<=24.9)
		{ einordnung = " → Normalgewicht";}
			
		else if (bmi>=24.91&&bmi<=29.0)
		{ einordnung = " → Übergewicht";}
			
		else 
		{ einordnung = " → Adipositas";}
			
		//Ergebnis BMI mit zuordnung Wertebereich ausgeben
		System.out.println("               Dein BMI beträgt : "+bmi+einordnung);
		System.out.println("");
		System.out.println("");
			
		//Gewichtsklassen berechnen
			
		double größe_double_2 = größe_double*größe_double;
		größe_double_2 = Math.round(größe_double_2*10.0)/10.0;
			
			
			
		double bmi_normalgewicht_u = 19.0*größe_double_2;
		bmi_normalgewicht_u = Math.round(bmi_normalgewicht_u*10.0)/10.0;
			
		double bmi_normalgewicht_o = 24.9*größe_double_2;
		bmi_normalgewicht_o = Math.round(bmi_normalgewicht_o*10.0)/10.0;
			
		double bmi_übergewicht_u = 24.91*größe_double_2;
		bmi_übergewicht_u = Math.round(bmi_übergewicht_u*10.0)/10.0;
			
		double bmi_übergewicht_o = 29.0*größe_double_2;
		bmi_übergewicht_o = Math.round(bmi_übergewicht_o*10.0)/10.0;
			
		//Achtung Rundungsfehler!Muss noch behoben werden!
			
			
		//Tabelle Gewichtskategorie ausgeben
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            KATEGORIE                    GEWICHT                 ");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            Untergewicht       ⁞ unter "+bmi_normalgewicht_u+" kg");
		System.out.println("            Normalgewicht      ⁞ von   "+bmi_normalgewicht_u+" - "+bmi_normalgewicht_o+" kg");
		System.out.println("            Übergewicht        ⁞ von   "+bmi_übergewicht_u+" - "+bmi_übergewicht_o+" kg");
		System.out.println("            Adipositas         ⁞ über  "+bmi_übergewicht_o+" kg");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
	}
	
	else
	{
		//BMI Wert zuordnen
		String einordnung;
					
		if (bmi<19.5)
		{ einordnung = " → Untergewicht";}
					
		else if (bmi>=19.5&&bmi<=25.4)
		{ einordnung = " → Normalgewicht";}
					
		else if (bmi>=25.41&&bmi<=29.5)
		{ einordnung = " → Übergewicht";}
					
		else 
		{ einordnung = " → Adipositas";}
					
		//Ergebnis ausgeben
		System.out.println("               Dein BMI beträgt : "+bmi+einordnung);
		System.out.println("");
		System.out.println("");
					
		//Gewichtsklassen berechnen
					
		double größe_double_2 = größe_double*größe_double;
		größe_double_2 = Math.round(größe_double_2*10.0)/10.0;
					
					
					
		double bmi_normalgewicht_u = 19.5*größe_double_2;
		bmi_normalgewicht_u = Math.round(bmi_normalgewicht_u*10.0)/10.0;
					
		double bmi_normalgewicht_o = 25.4*größe_double_2;
		bmi_normalgewicht_o = Math.round(bmi_normalgewicht_o*10.0)/10.0;
					
		double bmi_übergewicht_u = 25.41*größe_double_2;
		bmi_übergewicht_u = Math.round(bmi_übergewicht_u*10.0)/10.0;
					
		double bmi_übergewicht_o = 29.5*größe_double_2;
		bmi_übergewicht_o = Math.round(bmi_übergewicht_o*10.0)/10.0;
					
		//Achtung Rundungsfehler!Muss noch behoben werden!
					
					
		//Tabelle BMI ausgeben
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            KATEGORIE                    GEWICHT                 ");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
		System.out.println("            Untergewicht       ⁞ unter "+bmi_normalgewicht_u+" kg");
		System.out.println("            Normalgewicht      ⁞ von   "+bmi_normalgewicht_u+" - "+bmi_normalgewicht_o+" kg");
		System.out.println("            Übergewicht        ⁞ von   "+bmi_übergewicht_u+" - "+bmi_übergewicht_o+" kg");
		System.out.println("            Adipositas         ⁞ über  "+bmi_übergewicht_o+" kg");
		System.out.println("        …………………………………………………………………………………………………………………………………………     ");
	}	
		
		
	}}



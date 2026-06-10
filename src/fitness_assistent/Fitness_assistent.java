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
		
		
	//(4) Abfrage Alter
	System.out.println("");
	System.out.println("Wie alt bist du? (Runde dein Alter auf eine ganze Zahl auf)");
	int alter = scanner.nextInt();
	
	
	//(5) Auswertung BMI
	System.out.println("");
	System.out.println("Danke für deine Angaben.");
	System.out.println("Nachfolgend siehst du deine Körperwerte und den daraus resulierenden BMI (Body-Mass-Index)");
	System.out.println("");
	System.out.println("                  Name    : "+name);
	System.out.println("                  Alter   : "+alter+" Jahre");
	System.out.println("                  Größe   : "+größe_double+" m");
	System.out.println("                  Gewicht : "+gewicht_double+" kg");
	System.out.println("");
	//(5) BMI berechnen
	double bmi;
	bmi = gewicht_double/(größe_double*größe_double);
	
	System.out.printf("         Dein BMI beträgt : %.2f%n",bmi);//BMI auf zwei Nachkommastellen runden
	
		}
		
		
	
	}



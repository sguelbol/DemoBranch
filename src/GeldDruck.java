import java.util.Scanner;

public class GeldDruck {
	

	static void druckeGeld() {
		int[][] geldscheinMoeglichkeiten = {{500,0}, {200,0}, {100,0}, {50,0}, {20,0}, {10,0}, {5,0}};
		
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Gib einen Betrag ein!");
		int betrag = eingabe.nextInt();
		
		if(betrag % 5 == 0 && betrag > 0) {
			int restbetrag = betrag;
			int i = 0;
			while(restbetrag != 0) {
				geldscheinMoeglichkeiten[i][1] = (restbetrag / geldscheinMoeglichkeiten[i][0]);
				restbetrag = restbetrag % geldscheinMoeglichkeiten[i][0];
				i++;
			}
			for(int j = 0; j < geldscheinMoeglichkeiten.length; j++)
			{
				if (geldscheinMoeglichkeiten[j][1] > 0)
				{
					System.out.println(geldscheinMoeglichkeiten[j][1] + " mal " + geldscheinMoeglichkeiten[j][0]+ " Euro-Scheine");
				}
			}
			druckeGeld();
			
		}
		else {
			System.out.println("Betrag ungültig");//Fehlermeldung
			druckeGeld();//Bei ungültigen Werten wird die Methode wieder aufgerufen
		}
	}
	
	public static void main(String[] args) {
		druckeGeld();//Methodenaufruf
	}
}

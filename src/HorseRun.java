import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class HorseRun {

	public static final int minHorses = 12;
	public static final int maxHorses = 20;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Souhaitez-vous simuler d'une course?");
		String response = scan.nextLine();
		
		while(response.equalsIgnoreCase("Oui") || response.equalsIgnoreCase("o")) {

			System.out.println("Veuillez choisir le nombre de chevaux");
			int horseNumber = validInput(scan, "Veuillez entrer entrer un nombre !!!");
			
			if(horseNumber < minHorses  || horseNumber > maxHorses ) {
				System.out.println("Veuillez entrer un nombre compris entre 12 et 20 !!");
				
			}else {
				
				System.out.println("Veuillez choisir le type de course hippique");
				switch(runChoice()) {
				case "tierce" : 
					tierce(horseNumber);
					break;
				case "quarte" :
					quarte(horseNumber);
					break;
				default :
					quinte(horseNumber);
				}
			}
			
			
			System.out.println("Voulez-vous continuer?");
			scan.nextLine();
			response = scan.nextLine();
		}
		
		System.out.println("A bientôt");
		
	}

	public static int validInput(Scanner scan, String errorMessage) {
		int input = 0;
		boolean validInput = false;

		while (!validInput) {
			if (scan.hasNextInt()) {
				input = scan.nextInt();
				validInput = true;
			} else {
				System.out.println(errorMessage);
				scan.next();
			}
		}

		return input;
	}
	
	public static String runChoice() {
		String choice = "";
		HashMap<Integer, String> choiceList = new HashMap<Integer, String>();
		choiceList.put(1, "tierce");
		choiceList.put(2, "quarte");
		choiceList.put(3, "quinte");
		for(int i : choiceList.keySet()) {
			System.out.print("[" + i + " - " + choiceList.get(i) + "]");
		}
		System.out.println();
		
		System.out.println("Quel type de course souhaitez-vous?(entrez un numéro)");
		boolean ok = false;
		
		while(!ok) {
			int userChoice = validInput(scan, "Veuillez entrer un numéro valide !!");
			if(choiceList.containsKey(userChoice)) {
				choice = choiceList.get(userChoice);
				ok = true;
			}else System.out.println("Veuillez entrer un numéro de la liste !");
				
		}
		
		return choice;
	}

	public static void tierce(int horse) {

		int[] winnerTierce = new Random().ints(1, horse).distinct().limit(3).toArray();

		for (int i = 0; i < winnerTierce.length; i++) {
			System.out.print(winnerTierce[i] + " - ");
		}
		System.out.println();
	}

	public static void quarte(int horse) {

		int[] winnerQuarte = new Random().ints(1, horse).distinct().limit(4).toArray();

		for (int i = 0; i < winnerQuarte.length; i++) {
			System.out.print(winnerQuarte[i] + " - ");
		}
		System.out.println();
	}

	public static void quinte(int horse) {

		int[] winnerQuinte = new Random().ints(1, horse).distinct().limit(5).toArray();

		for (int i = 0; i < winnerQuinte.length; i++) {
			System.out.print(winnerQuinte[i] + " - ");
		}
		System.out.println();
	}

}

/*
 * Besoin : permettre d'afficher une arrivée tirée aléatoirement en fonction du
 * nombre de chevaux et du type de la course.
 *
 * Type de course: tiercé, quarté et quinté (respectivement 3, 4 et 5 gagnants)
 * nombre de chevaux et type déterminé par l'utilisateur
 *
 */

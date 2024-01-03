import java.util.Random;
import java.util.Scanner;

public class HorseRun {

	public static final int minHorses = 12;
	public static final int maxHorses = 20;

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Veuillez choisir le nombre de chevaux");
		int horseNumber = validInput(scan, "Veuillez entrer entrer un nombre !!!");
		tierce(horseNumber);
		// quarte();
		// quinte();
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
				System.out.println("Veuillez choisir le nombre de chevaux");
				scan.next();
			}
		}

		return input;
	}

	public static void tierce(int horse) {

		int[] winnerTierce = new Random().ints(1, horse).distinct().limit(3).toArray();

		for (int i = 0; i < winnerTierce.length; i++) {
			System.out.print(winnerTierce[i] + " - ");
		}
	}

	public static void quarte(int horse) {

		int[] winnerQuarte = new Random().ints(1, horse).distinct().limit(4).toArray();

		for (int i = 0; i < winnerQuarte.length; i++) {
			System.out.print(winnerQuarte[i] + " - ");
		}
	}

	public static void quinte(int horse) {

		int[] winnerQuinte = new Random().ints(1, horse).distinct().limit(5).toArray();

		for (int i = 0; i < winnerQuinte.length; i++) {
			System.out.print(winnerQuinte[i] + " - ");
		}
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

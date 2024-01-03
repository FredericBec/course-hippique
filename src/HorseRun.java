import java.util.Random;
import java.util.Scanner;

public class HorseRun {
	
	public static final int minHorses = 12;
	public static final int maxHorses = 20;
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		tierce();
		

	}
	
	public static int getHorses() {
		System.out.println("Veuillez choisir le nombre de chevaux");
		int horseNumber = scan.nextInt();
		
		return horseNumber;
	}
	
	public static void tierce(){
		
		int[] winnerTierce = new Random().ints(1, getHorses()).distinct().limit(3).toArray();
		
		for(int i = 0; i < winnerTierce.length; i++) {
			System.out.print(winnerTierce[i] + " - ");
		}
	}
	

}


/*
 *Besoin : permettre d'afficher une arrivée tirée aléatoirement en fonction du nombre de chevaux et du type de la course.
 *
 *Type de course: tiercé, quarté et quinté (respectivement 3, 4 et 5 gagnants)
 *nombre de chevaux et type déterminé par l'utilisateur
 *
 */

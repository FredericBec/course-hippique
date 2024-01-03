import java.util.Scanner;

public class HorseRun {
	
	public static final int minHorses = 12;
	public static final int maxHorses = 20;
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		

	}
	
	public static int getHorses() {
		System.out.println("Veuillez choisir le nombre de chevaux");
		int horseNumber = scan.nextInt();
		
		return horseNumber;
	}
	
	public static void tierce(){
		
		for(int i = 0; i < getHorses(); i++) {
			
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

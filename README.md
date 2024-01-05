# Simulateur de courses hippiques

## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Usage](#usage)

## General info

This project can simulate a horse race with random winners in each type of race.

## Technologies

Java SE 8.
eclipse IDE for java developers
Git bash.

## Usage

At the beggining of the program, users are asking by the program if they want to play (yes or no).

Then the program ask users for the number of horses at the start of the race.
The method validInput verify if a number in entry or notify users to an incorrect entry.

```java
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
```

At the end of the main program, the program generate race results in terms of race type and if users enter a correct number of horses. the method runChoice() define the type of race.

Each result is calculated randomly by one of method below.

```
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
```


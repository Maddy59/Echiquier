package fr.eni.echiqier;

public class Echiquier {

	static int caseEchiquier = 64;
	static float grainRiz = 1;

	public static void main(String[] args) {
		for (int i = 0; i < caseEchiquier; i++) {
			grainRiz *= 2;
		}
		System.out.println("Il y a " + grainRiz + " sur la " + caseEchiquier + "ième case du jeu");
	}
}

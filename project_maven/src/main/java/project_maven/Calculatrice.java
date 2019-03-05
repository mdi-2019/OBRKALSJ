package project_maven;

import java.util.Scanner;

public class Calculatrice {

	private static int mode;
	
	public static int mode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choissisez le mode : 1 pour mode normal, 2 pour mode scientifique");
		if(sc.equals("1")) {
			mode = 1;
			return mode;
		} else if (sc.equals("2")) {
			mode = 2;
			return mode;
		} else {
			System.out.print("erreur");
			return -1;
		}
	}
}

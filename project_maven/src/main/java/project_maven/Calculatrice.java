package project_maven;

import java.util.Scanner;

public class Calculatrice {

	private static int mode;
	
	public static int mode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("choissisez le mode : 1 pour mode normal, 2 pour mode scientifique");
		if(sc.equals("1")) {
			this.mode = 1;
			return this.mode;
		} else if (sc.equals("2")) {
			this.mode = 2;
			return this.mode;
		} else {
			System.out.print("erreur");
			return -1;
		}
	}
}

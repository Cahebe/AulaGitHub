package application;

import java.util.Locale;
import java.util.Scanner;

public class AulaGit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas são agora? ");
		int horas = sc.nextInt();
		sc.nextLine();
		
		if (horas < 12) {
			System.out.println("Bom dia!");
		}else if (horas < 18) {
			System.out.println("Boa tarde!");
		}else {
			System.out.println("Boa noite!");
		}
		
		
		
		sc.close();

	}

}

import java.util.Scanner;

import com.isaac.clases.Llibre;
import com.isaac.exceptions.LlibreException;

/*
*
* @author Isaac
*/

public class Principal {
	
	public static void main(String[] args) {;
		int x = 0;
		Principal principal = new Principal();
		while (x != 1) {
			try {
				principal.crearLlibre();
				x = 1;
			} catch (LlibreException ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		}
	}
		
	public void crearLlibre() throws LlibreException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Codi del llibre: ");

		int codi = scanner.nextInt();

		scanner.nextLine();

		System.out.print("\nTítol del llibre: ");

		String titol = scanner.nextLine();
		
		Llibre nou = new Llibre(codi, titol);
		System.out.println(nou);
	}

}

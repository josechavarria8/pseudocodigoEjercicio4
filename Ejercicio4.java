
import java.util.Scanner;


public class Ejercicio4 {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		int edad;
		int emayor= 0;
		int emenor;
		double i;
		emenor = 200;
		for (i=1;i<=20;i++) {
			System.out.println("Ingrese edad: "+i);
			edad =  scanner.nextInt();
			if (edad>emayor) {
				emayor = edad;
			}
			if (edad<emenor) {
				emenor = edad;
			}
		}
		System.out.println("Edad Mayor: "+emayor);
		System.out.println("Edad Menor: "+emenor);
	}


}


package excpetions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		int dividendo = 0, divisor = 0;
		boolean loop = true;

		do {
			
			try {
			System.out.println("\nDigite o dividendo:");
			dividendo = scanner.nextInt();
			System.out.println("Digite o divisor");
			divisor = scanner.nextInt();
			
			divide(dividendo,divisor);
			
			} catch(InputMismatchException e) {
				
				System.err.printf("\nErro: "+ e);
				scanner.nextLine();
				System.out.println("\nDigite valores inteiros!");
			}catch(ArithmeticException e) {
				System.err.printf("\nErro: "+e);
				scanner.nextLine();
				System.out.println("\nDivisão Inválida!");
			}

		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}

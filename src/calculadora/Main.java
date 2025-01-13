package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int a = getValidNumber(input, "Ingrese el primer número: ");
		int b = getValidNumber(input, "Ingrese el segundo número: ");
		
		char symbol = getValidOperation(input, "Ingrese el símbolo de la operación (+, -, *, /): ");
		
		input.close();

		calculadora calc = new calculadora(a, b, symbol);
		
		
	}

	// Función para solicitar un número válido al usuario
	private static int getValidNumber(Scanner input, String prompt) {
		int number = 0;
		while (true) {
			try {
				System.out.print(prompt);
				number = input.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese un número válido.");
				input.next(); // Limpiar la entrada inválida
			}
		}
		return number;
	}

	private static char getValidOperation(Scanner input, String prompt) {
		char symbol;
		String validSymbols = "+-*/";
		while (true) {
			System.out.print(prompt);
			symbol = input.next().charAt(0);
			if (validSymbols.indexOf(symbol) != -1) {
				break;
			} else {
				System.out.println("Por favor, ingrese un símbolo de operación válido (+, -, *, /).");
			}
		}
		return symbol;
	}
}
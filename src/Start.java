import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

	public static float suma(float n1, float n2) {
		float resultado = 0.0f;
		resultado = n1 + n2;
		return resultado;
	}

	public static float resta(float n1, float n2) {
		float resultado = 0.0f;
		resultado = n1 - n2;
		return resultado;
	}

	public static float multiplicacion(float n1, float n2) {
		float resultado = 0.0f;
		resultado = n1 * n2;
		return resultado;
	}

	public static float division(float n1, float n2) {
		float resultado = 0.0f;
		resultado = n1 / n2;
		if (n2 == 0) {
			return -1;
		} else {
			return resultado;
		}
	}

	public static float mayor(float n1, float n2, float n3) {
		float result = 0.0f;

		if ((n1 > n2) && (n1 > n3)) {
			return n1;
		} else if ((n2 > n1) && (n2 > n3)) {
			return n2;

		} else if ((n3 > n1) && (n3 > n2)) {
			return n3;
		}
		return result;
	}

	public static int factorial(int n1) {
		int i = 0;
		int acum = 1;

		if (n1 < 1) {
			return -1;
		} else {
			for (i = 1; i <= n1; i++) {
				acum = acum * i;
			}
			return acum;
		}
	}

	public static int leerOpcion(Scanner entradaDatos) {
		while (true) {
			try {
				return entradaDatos.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: debe introducir un número válido. Inténtelo de nuevo.");
				entradaDatos.nextLine(); // Limpiar el buffer
				continue;
			}
		}
	}

	public static float leerFloat(Scanner entradaDatos) {
		while (true) {
			try {
				return entradaDatos.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Error: debe introducir un número válido. Inténtelo de nuevo.");
				entradaDatos.nextLine(); // Limpiar el buffer
				continue;
			}
		}
	}

	public static void main(String[] args) {
		Scanner entradaDatos = new Scanner(System.in);

		float num1 = 0.0f;
		float num2 = 0.0f;
		float num3 = 0.0f;
		int num4 = 0;
		int result2 = 0;
		float result = 0.0f;
		int numOperacion = 0;

		System.out.println("*************************************");
		System.out.println("**** CALCULADORA CALCULATOR S.A. ****");
		System.out.println("*************************************");
		System.out.println("");
		System.out.println("");

		do {
			System.out.println("");
			System.out.println("");
			System.out.println("Introduzca una opción del menú");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Número mayor de 3 números");
			System.out.println("6.- Factorial");
			System.out.println("0.- Salir");
			System.out.println("");
			System.out.println("Introduzca una opción: ");
			System.out.println("");
			System.out.println("");

			numOperacion = leerOpcion(entradaDatos);

			if (numOperacion == 1) {
				System.out.println("******SUMA******");
				System.out.println("");

				System.out.println("Introduzca el primer número flotante a sumar: ");
				num1 = leerFloat(entradaDatos);
				System.out.println("Introduzca el segundo número flotante a sumar: ");
				num2 = leerFloat(entradaDatos);

				result = suma(num1, num2);

				System.out.println("*************************");
				System.out.println("La suma de " + num1 + " y " + num2 + " es " + result);
				System.out.println("*************************");
			} else if (numOperacion == 2) {
				System.out.println("******RESTA******");
				System.out.println("");

				System.out.println("Introduzca el primer número flotante a restar: ");
				num1 = leerFloat(entradaDatos);
				System.out.println("Introduzca el segundo número flotante a restar: ");
				num2 = leerFloat(entradaDatos);

				result = resta(num1, num2);

				System.out.println("*************************");
				System.out.println("La resta de " + num1 + " y " + num2 + " es " + result);
				System.out.println("*************************");
			} else if (numOperacion == 3) {
				System.out.println("******MULTIPLICACIÓN******");
				System.out.println("");

				System.out.println("Introduzca el primer número flotante a multiplicar: ");
				num1 = leerFloat(entradaDatos);
				System.out.println("Introduzca el segundo número flotante a multiplicar: ");
				num2 = leerFloat(entradaDatos);

				result = multiplicacion(num1, num2);

				System.out.println("*************************");
				System.out.println("La multiplicación de " + num1 + " y " + num2 + " es " + result);
				System.out.println("*************************");
			} else if (numOperacion == 4) {
				System.out.println("******DIVISIÓN******");
				System.out.println("");

				System.out.println("Introduzca el primer número flotante a dividir: ");
				num1 = leerFloat(entradaDatos);
				System.out.println("Introduzca el segundo número flotante a dividir: ");
				num2 = leerFloat(entradaDatos);

				result = division(num1, num2);

				if (result == -1) {
					System.out.println("Error, división por 0");
				} else {
					System.out.println("*************************");
					System.out.println("La división de " + num1 + " y " + num2 + " es " + result);
					System.out.println("*************************");
				}
			} else if (numOperacion == 5) {
				System.out.println("******EL MAYOR NÚMERO DE TRES******");
				System.out.println("");
				System.out.println("Introduzca el primer número flotante de los tres: ");
				num1 = leerFloat(entradaDatos);
				System.out.println("Introduzca el segundo número flotante de los tres: ");
				num2 = leerFloat(entradaDatos);
				System.out.println("Introduzca el tercer número flotante de los tres: ");
				num3 = leerFloat(entradaDatos);

				result = mayor(num1, num2, num3);
				System.out.println("El número mayor es " + result);

			} else if (numOperacion == 6) {
				System.out.println("******FACTORIAL******");
				System.out.println("");
				System.out.print("Introduzca un número para calcular el factorial: ");
				System.out.println("");

				num1 = leerFloat(entradaDatos);

				result = factorial(num4);

				if (result2 == -1) {
					System.out.println("Error valor inferior a 0, introduzca un valor superior a 0.");
				} else {
					System.out.print("El factorial de " + num4 + " es " + result2 + ".");
				}

			} else if (numOperacion > 6) {
				System.out.println("Opción errónea");
			} else {
				System.out.println("");
			}
		} while (numOperacion != 0);
		System.out.println("El programa ha finalizado");
		entradaDatos.close();
	}
}

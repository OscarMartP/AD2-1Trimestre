package actividad02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Actividad02 {

	static ArrayList<Integer> numeros = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {

		int opcion;
		do {
			opcion = imprimirMenu();
			switch (opcion) {
			case 1:
				crearArray();
				break;
			case 2:
				mostrarPorPantalla();
				break;
			case 3:
				System.out.println("Salir del programa.");
			}
		} while (opcion != 3);

	}

	private static int imprimirMenu() {
		int opcion;
		Scanner kb = new Scanner(System.in);
		System.out.println("------------------- MENU DEL PRROGRAMA -------------------");
		System.out.println("1. Crear Array con los primeros 100 números impares");
		System.out.println("2. Mostrar los numeros guardados");
		System.out.println("3. Salir del programa");
		opcion = kb.nextInt();
		return opcion;

	}

	private static void mostrarPorPantalla() {
		for (int i = numeros.size(); i > 0; i--) {
			System.out.println(numeros.get(numeros.size() - i));
			
			
		}
	}

	private static void crearArray() throws IOException {
		Scanner kb = new Scanner(System.in);
		String nombre;
		System.out.println("indique el nombre del archivo");
		nombre = kb.nextLine();
		File f = new File("C:\\Users\\pipe4\\Desktop\\" + nombre);
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		int num = 1;
		numeros.add(num);
		for (int i = 0; i < 99; i++) {
			num += 2;
			numeros.add(num);
			bw.write(num);
		}
		bw.close();

	}

}
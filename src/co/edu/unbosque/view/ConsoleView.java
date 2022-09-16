package co.edu.unbosque.view;

import java.util.Scanner;

import co.edu.unbosque.controller.Controller;

public class ConsoleView {

	private Scanner scanner;
	private Controller controller;

	public ConsoleView() {
		scanner = new Scanner(System.in);
	}

	public int captureData(String mensaje) {
		int data = 0;
		printInConsole(mensaje);
		data = scanner.nextInt();
		return data;
	}

	public void printInConsole(String message) {
		System.out.println(message);
	}

	public void setController(Controller controller) {
		this.controller = controller;

	}

}

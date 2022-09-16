package co.edu.unbosque.controller;

import co.edu.unbosque.model.Operations;
import co.edu.unbosque.view.ConsoleView;

public class Controller {

	ConsoleView consoleView;
	Operations operations;

	int acum = 0;

	public Controller() {
	}

	public void start() {
		boolean active = true;
		int numA = consoleView.captureData("Ingrese el número a dividir por 2");
		int numB = consoleView.captureData("Ingrese el número a multiplicar por 2");

		do {

			int firstResult = operations.divideByTwo(numA);
			int secondResult = operations.multiplyByTwo(numB);

			boolean isPair = operations.isPair(firstResult);

			if (!isPair)
				acum = acum + secondResult;
		
			if (firstResult <= 0)
				active = false;
			
			consoleView.printInConsole("Resultado division: " + firstResult);
			consoleView.printInConsole("Resultado Multiplicación: " + secondResult);
			consoleView.printInConsole("Es par?: " + isPair);
			consoleView.printInConsole("Acumulado?: " + acum);

			numA = firstResult;
			numB = secondResult;

		} while (active);

		consoleView.printInConsole("Multiplicación total: " + acum);

	}

	public void setConsoleView(ConsoleView consoleView) {
		this.consoleView = consoleView;
	}

	public void setOperations(Operations operations) {
		this.operations = operations;
	}

}

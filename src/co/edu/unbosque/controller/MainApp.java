package co.edu.unbosque.controller;

import co.edu.unbosque.model.Operations;
import co.edu.unbosque.view.ConsoleView;

public class MainApp {

	ConsoleView consoleView;
	Operations operations;
	Controller controller;

	public static void main(String[] args) {
		new MainApp().start();
	}

	private void start() {
		operations = new Operations();
		consoleView = new ConsoleView();
		controller = new Controller();

		controller.setConsoleView(consoleView);
		controller.setOperations(operations);

		controller.start();
	}

}

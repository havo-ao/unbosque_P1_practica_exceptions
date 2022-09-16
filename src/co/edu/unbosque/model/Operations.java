package co.edu.unbosque.model;

import co.edu.unbosque.controller.Controller;

public class Operations {

	Controller controller;

	public Operations() {
	}

	public int divideByTwo(int number) {
		int result = number / 2;
		return result;
	}

	public int multiplyByTwo(int number) {
		int result = number * 2;
		return result;
	}

	public boolean isPair(int number) {
		boolean isPair = false;
		
		if (number % 2 == 0)
			return true;

		return isPair;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}

}

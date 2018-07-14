package com.nvt.iview;

import java.util.Scanner;

import com.nvt.iview.IEnterData;

public class InputData implements IEnterData {

	public int enterInteger(String message) {
		int intValue = 0;
		boolean flag = true;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.println(message);
				intValue = scanner.nextInt();
				flag = false;
			} catch (Exception e) {
				System.out.println("Your value invalid.Try again!");
			}
		} while (flag);
		return intValue;
	}

	public String enterString(String message) {
		String stringValue = "";
		boolean flag = true;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.println(message);
				stringValue = scanner.nextLine();
				flag = false;
			} catch (Exception e) {
				System.out.println("Your value invalid.Try again");
			}
		} while (flag);
		return stringValue;
	}

	public double enterDouble(String message) {
		double doubleValue = 0.0;
		boolean flag = true;
		do {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.println(message);
				doubleValue = scanner.nextDouble();
				flag = false;
			} catch (Exception e) {
				System.out.println("Your value invalid.Try again");
			}
		} while (flag);
		return doubleValue;

	}
}

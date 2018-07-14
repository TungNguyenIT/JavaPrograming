package cudosoft.demo.view;

import java.util.Scanner;

import cudosoft.demo.iview.IEnterData;

public class EnterData implements IEnterData {

	@Override
	public int intValue(String message) {
		int value = 0;
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println(message);
				value = scanner.nextInt();

				return value;
			} catch (Exception e) {
				System.out.println("This is data type invalid! Please try again!");
				flag = true;
			}
		} while (flag);
		
		return value;
	}

	@Override
	public String stringValue(String message) {
		String value;
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);
		value = scanner.nextLine();
		
		return value;
	}

}

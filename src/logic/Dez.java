package logic;

public class Dez extends Calculator {

	public int checkinput(String input) {
		int errorlevel = 0;
		if (input.equals("")) {
			errorlevel = 1;
		} else if (input.length() > 5) {
			errorlevel = 2;
		} else {
			for (int i = 0; i < input.length(); i++) {
				char c = input.charAt(i);
				if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4'
						&& c != '5' && c != '6' && c != '7' && c != '8'
						&& c != '9') {
					errorlevel = 3;
				}
			}
		}
		return errorlevel;
	}
}

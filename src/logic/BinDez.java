package logic;

public class BinDez implements Calculation {

	public String getoutput(String input) {
		/*
		 * String output = ""; int speicher = 0; for(int i = 0; i <
		 * input.length(); i++) { int c =
		 * Integer.parseInt(String.valueOf(input.charAt(input.length() - (i + 1
		 * )))); speicher = speicher + (int) (c * Math.pow(2,i)); } return
		 * Integer.toString(speicher);
		 */
		return Integer.toString(Integer.parseInt(input, 2));

	}
}

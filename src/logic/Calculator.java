package logic;

import data.DataInterface;

public class Calculator {

	DataInterface d = new DataInterface();

	public void checkinput() {

	}

	public String[] getresult(String input, int format) {

		ZahlZS src = new ZahlZS(input, format, "");
		d.add(input, Integer.toString(format)); // Eigentlich w�rde src
												// �bergeben werden m�ssen
		String Result1 = "";
		String Result2 = "";
		if (format == 2) {
			BinDez BinDez = new BinDez();
			BinHex BinHex = new BinHex();
			Result1 = BinDez.getoutput(input);
			Result2 = BinHex.getoutput(input);
		} else if (format == 10) {
			DezBin DezBin = new DezBin();
			DezHex DezHex = new DezHex();
			Result1 = DezBin.getoutput(input);
			Result2 = DezHex.getoutput(input);
		} else if (format == 16) {
			HexBin HexBin = new HexBin();
			HexDez HexDez = new HexDez();
			Result1 = HexBin.getoutput(input);
			Result2 = HexDez.getoutput(input);
		}

		String[] Results = new String[] { "Result1", "Result2" };
		Results[0] = Result1;
		Results[1] = Result2;

		return Results;

	}

}

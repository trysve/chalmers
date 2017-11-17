import javax.swing.*;
public class laboration1 {

	final static int defaultÅrtal = 1754;
	
	public static void main (String[] arg) {
		for(;;) {
		String indata = JOptionPane.showInputDialog(""
				+ "Skriv ett datum på formen åååå-mm-dd");
		if (indata != null)
			RaknaDagar(indata);
		else
			break;
		}
	}
	
	public static boolean UndersökSkottår(int year) {
		if ((year%4 == 0 && year%100 != 0)||
				(year%100 ==0 && year%400 == 0)) {
			return true;
		} else
			return false;
	}
	
	public static String VeckoDag(int i) {
		switch(i) {
		case 0:
			return "måndag";
		case 1:
			return "tisdag";
		case 2:
			return "onsdag";
		case 3:
			return "torsdag";
		case 4:
			return "fredag";
		case 5:
			return "lördag";
		case 6:
			return "söndag";
		default:
			return null;
		}
	}
	
	public static void RaknaDagar(String indata) {

		int _årtal_ = Integer.parseInt(indata.substring(0, 4));
		int _månad_ = Integer.parseInt(indata.substring(5, 7));
		int _dag_ = Integer.parseInt(indata.substring(8, 10));
		int månader[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int antalDagar = _dag_; //antal dagar denna månad,
								//och alla dagar tidigare månader detta år
		
		for(int i = 0; i<_månad_-1; i++) {
			antalDagar = antalDagar + månader[i];
		}
		
		if (_månad_ > 2 && UndersökSkottår(_årtal_) == true) {
			antalDagar++;
		}
		
		int skottår = 0; //antalet skottår
		for(int c=defaultÅrtal; c<_årtal_; c++)
		{
			if (UndersökSkottår(c) == true) {
				skottår++;
			}
		}
		
		int totaltAntalDagar = antalDagar + (skottår*366) 
				+ (_årtal_-defaultÅrtal-skottår)*365;
		
		int veckodag = totaltAntalDagar%7;
		
		JOptionPane.showMessageDialog(null, 
						"Det är en " + VeckoDag(veckodag));
		
	}
}

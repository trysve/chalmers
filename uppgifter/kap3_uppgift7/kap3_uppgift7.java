package kap3_uppgift7;
import javax.swing.*;

public class kap3_uppgift7 {
	public static void main(String[] args) {
		for(;;) {
			String str = JOptionPane.showInputDialog("Ange tal");
			if(str!=null) {
			double i = Double.parseDouble(str);
			JOptionPane.showMessageDialog(null, c.sqrt(i));
			} 
			else
				System.exit(0);
		}
	}
}

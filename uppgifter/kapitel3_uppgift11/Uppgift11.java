package kapitel3_uppgift11;
import javax.swing.*;

public class Uppgift11 {
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5};
		int[] b = {0,-11,1,1,5,2};
		int[] c = {0,1,2,3,4,5,6};
		JOptionPane.showMessageDialog(null, Arrays.equals(a, b));
	}
}

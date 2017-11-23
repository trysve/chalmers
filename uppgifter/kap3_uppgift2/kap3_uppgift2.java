import javax.swing.*;
import java.util.*;

public class kap3_uppgift2 {
	public static void main(String[] args) {
		List<Integer> integer = new LinkedList<Integer>();
		
		for(;;) {
			String str = JOptionPane.showInputDialog("Ange talpar, två åt gången");
			if(str == null)
				break;
			integer.add(Integer.parseInt(str));
		}
		
		for(int c=0;c<integer.size()-1;) {
			JOptionPane.showMessageDialog(null, "största gemensamma delaren av " + integer.get(c) + 
					" och " + integer.get(c+1) + " är " + Euclides.sgd(integer.get(c),integer.get(c+1)));
			c = c+2;
		}
		
		
	}
}

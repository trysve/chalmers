package kapitel3_uppgift11;

public class Arrays {
	public static boolean equals(int[] a, int[] b) {
		if(a.length == b.length) {
			for(int c=0;c<a.length;c++) {
				if(!(a[c] == b[c]))
					return false;
			}
			return true;
		}
		else
			return false;
	}
}

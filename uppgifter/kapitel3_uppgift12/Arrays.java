package kapitel3_uppgift12;

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
	
	public static int[] rotateArray(int n, int[] a) {
		int i;
		if (n%a.length != 0 && n>=0)
			i = n%a.length;
		else
			i = 0;
		int[] b = new int[a.length];
		for(int c=0;c<b.length;) {
			if(c+i < b.length) {
				b[c+i] = a[c];
				c++;
			}
			else {
				for(int j=0;j<i;j++) {
					b[j] = a[c];
					c++;
				}
			}
		}
		return b;
	}
	
	
	public static void rotateArray2(int n, int[] a) {
		for(int i=0;i<n;i++) {
			a[0] = a[a.length-1];
			for(int c=1;c<a.length-1;c++)
				a[c]=a[c+1];
		}
	}
	
}

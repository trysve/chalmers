public class Euclides {
	public static int sgd(int m, int n) {
		if(n != 0) 
			return (m%n!=0) ? sgd(n,m%n) : n;
		else
			return 0;
	}

}



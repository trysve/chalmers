package kap3_uppgift7;

public class c {
	public static double sqrt(double x) {
		if (x>0) {
			double g = x;
			double g_ny = x/2;
			do {
				g = g_ny;
				g_ny = (g + (x/g))/2;
			} while(abs(g-g_ny) > 1e-6);
			return g;
		}
		else
			return 0;
	}
	public static double abs(double x) {
		if(x >= 0)
			return x;
		else
			return -x;
	}
}

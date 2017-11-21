package kapitel3_uppgift12;

public class Uppgift12 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		//int[] b = Arrays.rotateArray(1, a);
		int[] b = {1,2,3,4,5};
		Arrays.rotateArray2(1, b);
		for(int c : b)
			System.out.println(c);
	}
}

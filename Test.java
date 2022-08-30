public class Test {
	public static void main(String [] args) {
		int [] a = {1,3,5,7,8, 25, 35};
		int [] b = {2,6,9,11,15, 17, 20};
		int [] c = MergeSort.merge(a,b);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println();
		for (int i=0; i<b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		for (int i=0; i<c.length; i++) {
			System.out.print(c[i]+ " ");
		}
		System.out.println();
	}
}
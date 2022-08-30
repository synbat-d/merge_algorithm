public class Test {
	public static void main(String [] args) {
		int [] a = {10, 15,1, 3,4 , 2, 0};
		MergeSort.sort(a, 0, 6);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}
}

public class MergeSort {
	public static int [] merge (int [] a, int [] b){
		int alength = a.length;
		int blength = b.length;
		int i=0;
		int j=0;
		int k=0;
		int [] c = new int[alength+blength];
		while (i<alength && j<blength) {
			if (a[i]<b[j]) {
				c[k++] = a[i++];
			}
			else {
				c[k++] = b[j++];
			}
		}
		for (; i<alength; i++){
			c[k++] = a[i++];
		}
		for (; j<blength; j++){
			c[k++] = b[j++];
		}
		return c;
	}
}
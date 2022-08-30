
public class MergeSort {
	public static void merge (int [] arr, int l, int m, int h) {
		int n1 = m-l+1;
		int n2 = h-m;
		int [] arr1 = new int[n1];
		int [] arr2 = new int[n2];
		for (int i=0; i<n1; ++i) {
			arr1[i] = arr[l+i];
		}
		for (int i=0; i<n2; ++i) {
			arr2[i] = arr[m+i+1];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while (i < n1 && j < n2) {
			if (arr1[i]<arr2[j]) {
				arr[k] = arr1[i];
				i++;
			}
			else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		} 
		while (i<n1) {
			arr[k++] = arr1[i++];
		}
		while (j<n2) {
			arr[k++] = arr2[j++];
		}
		
	}
	
	static void sort (int [] arr, int l, int h) {
		if (l<h) {
			int m = (l+h)/2;
			sort(arr, l, m);
			sort(arr, m+1, h);
			merge(arr, l, m, h);
		}
	}
}
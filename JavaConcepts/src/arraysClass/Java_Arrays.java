package arraysClass;

public class Java_Arrays {
	static int a[] = { 10, 2, 5, 20, 1, 100, -1, 99, 89, 66 };
	static int n = a.length;

	public static void main(String[] args) {

		System.out.print("Given array is:" + "[");
		givenarray(a);

		int tem = 0;
		System.out.print("Sorted array in accesding order :" + " [");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					tem = a[i];
					a[i] = a[j];
					a[j] = tem;

				}

			}

			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("second largest element in the list is " + "" + a[n - 2]);

	}

	public static void givenarray(int[] a) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println("]");
	}
}

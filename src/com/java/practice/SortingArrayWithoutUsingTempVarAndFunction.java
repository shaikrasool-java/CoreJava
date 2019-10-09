package core.java.supers;

public class SortingArrayWithoutUsingTempVarAndFunction {
	public static void main(String[] args) {
		// Without using Arrays.sort function
		int i;
		int nos[] = { 12, 9, -4, -1, 3, 10, 34, 12, 11 };
		System.out.print("Values before sorting: \n");
		for (i = 0; i < nos.length; i++)
			System.out.println(nos[i] + "  ");
		sort(nos, nos.length);
		System.out.print("Values after sorting: \n");
		for (i = 0; i < nos.length; i++) {
			System.out.println(nos[i] + "  ");
		}
	}
	
	private static void sort(int nos[], int n) {
		for (int i = 1; i < n; i++) {
			int j = i;
			int B = nos[i];
			while ((j > 0) && (nos[j - 1] > B)) {
				nos[j] = nos[j - 1];
				j--;
			}
			nos[j] = B;
		}
	}
}
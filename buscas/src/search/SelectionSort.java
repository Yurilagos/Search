package search;

public class SelectionSort {

	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {

			int smallerIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (array[j] < array[smallerIndex]) {
					smallerIndex = j;

				}

			}
			int SmallerContent = array[smallerIndex];
			array[smallerIndex] = array[i];
			array[i] = SmallerContent;

		}
		
		return array;
	}
	

}

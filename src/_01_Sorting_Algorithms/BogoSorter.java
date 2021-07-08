package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    /*
     * Bogo sort is a joke sorting algorithm. It is considered the most
     * inefficient sorting algorithm while still maintaining the possibility
     * of eventually sorting data.
     * 
     * It works by following these steps:
     * STEP 1. Is the array in order?
     * if yes, finished; if no, go to step 2.
     * STEP 2. Take two random elements in the array and swap them.
     * STEP 3. Go back to step 1.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
    	int past = array[0];
    	boolean isOutOfOrder = false;
    	while (true) {
	        for (int i = 0; i < array.length; i++) {
	        	if (past > array[i]) {
	        		isOutOfOrder = true;
	        	}
	        	past = array[i];
	        }
	        if (!isOutOfOrder) {
	        	display.updateDisplay();
	        	return;
	        }
	        int array1 = new Random().nextInt(array.length-1);
	        int array2 = new Random().nextInt(array.length-1);
	        int temp = array[array1];
	        array[array1] = array[array2];
	        array[array2] = temp;
	        display.updateDisplay();
    	}
        
    }
}

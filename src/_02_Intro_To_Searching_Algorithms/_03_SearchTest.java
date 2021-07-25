package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

	String[] linear = {"Frog", "Computer", "Tyler", "Charlie", "Kayla", "Emily", "VCR"};
	int[] binary = {0, 100, 101, 500, 599, 10000, 10001, 10307};
	
    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        assertEquals(6, _01_LinearSearch.linearSearch(linear, "VCR"));
        assertEquals(1, _01_LinearSearch.linearSearch(linear, "Computer"));
        assertEquals(-1, _01_LinearSearch.linearSearch(linear, "Printer"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
        assertEquals(5, _02_BinarySearch.binarySearch(binary, 0, binary.length-1, 10000));
        assertEquals(4, _02_BinarySearch.binarySearch(binary, 0, binary.length-1, 599));
        assertEquals(-1, _02_BinarySearch.binarySearch(binary, 0, binary.length-1, 1));
    }
}

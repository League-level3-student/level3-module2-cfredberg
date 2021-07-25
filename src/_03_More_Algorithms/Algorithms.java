package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return num1 + " x " + num2 + " = " + num1*num2;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
        for (int i = 0; i < eggs.size(); i++) {
        	if (eggs.get(i) == "cracked") {
        		return i;
        	}
        }
    	return 0;
    }
    
    public static boolean isPrime(int num) {
    	boolean prime = true;
    	for (int i = 2; i < num; i++) {
    		if (num % i == 0) {
    			prime = false;
    		}
    	}
    	return prime;
    }
    
    public static boolean isSquare(int num) {
    	for (int i = 1; i <= num; i++) {
    		if (i * i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static boolean isCube(int num) {
    	for (int i = 1; i <= num; i++) {
    		if (i * i * i == num) {
    			return true;
    		}
    	}
    	return false;
    }
    
    public static int countPearls(List<Boolean> list) {
    	int count = 0;
    	for (int i = 0; i < list.size(); i++) {
    		if (list.get(i) == true) {
    			count++;
    		}
    	}
    	return count;
    }
    
    public static double findTallest(List<Double> peeps) {
		double tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
    	return tallest;
    	
    }
    
    public static String findLongestWord(List<String> words) {
		String word = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > word.length()) {
				word = words.get(i);
			}
		}
    	return word;
    	
    }

	public static Object containsSOS(List<String> message1) {
		for (int i = 0; i < message1.size(); i++) {
			if (message1.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		for (int i = 0; i < results.size(); i++) {
			for (int j = 0; j < results.size()-1; j++) {
				if (results.get(j) > results.get(j+1)) {
					
				}
			}
		}
		return null;
	}
}

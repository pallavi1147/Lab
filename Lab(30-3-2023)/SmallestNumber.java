package assignment;

public class SmallestNumber {

	    
	    public static void main(String[] args) {
	        // Initialize the three numbers
	        int num1 = 67;
	        int num2 = 89;
	        int num3 = 43;
	        
	        // Assume num1 is the smallest
	        int smallest = num1;

	        // If num2 is greater than the current smallest, update smallest to num2
	        if (num2 < smallest) {
	            smallest = num2;
	        }

	        // If num3 is greater than the current smallest, update smallest to num3
	        if (num3 < smallest) {
	            smallest = num3;
	        }

	        // Print the smallest number
	        System.out.println("The smallest number is: " + smallest);
	    }
	} 
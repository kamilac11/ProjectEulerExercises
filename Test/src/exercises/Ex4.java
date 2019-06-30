package euler4;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
import java.util.ArrayList;

public class Ex4 {

	public static void main(String[] args) {
		
		
		//this solution omits step of multiplication two factors, it uses products
		//and it doesnt work properly cause in loop it takes numbers in order: 998001, 998000...
		//not all the numbers are result of multiplication two three digit factors
		
		/*
		for (int i = 999 * 999; i > 100 * 100; i--) {
			Integer obj = new Integer(i);
			StringBuffer tekst = new StringBuffer(obj.toString());
			// StringBuffer tekst2 = new StringBuffer(tekst.reverse());
			if (isPalindrome(tekst)==true) {
				System.out.println("The largerst palindrome is: " + tekst);
				break; // if finds first biggest then ends 
			}
		
		}
			
			*/

		//this solution marks step of multiplication two factors;
		
		long startBufferTime = System.currentTimeMillis();
		int biggestPalindrome= 0;
		
		for(int j = 999; j>100; j--) {
			for(int k = 999; k>100; k--) {
				int product = j*k;
				StringBuffer value = new StringBuffer(new Integer(product).toString());
				if(isPalindrome(value)) {
					if(product > biggestPalindrome) {
						biggestPalindrome = product;
						}
					break; 
					
				}
			}
		}
		
		System.out.println("The largest palindrome is: " + biggestPalindrome);
		
		
		long endBufferTime = System.currentTimeMillis();

		long timeDuration = endBufferTime - startBufferTime;
		System.out.println("Time duration " + timeDuration);
		
	}

	public static boolean isPalindrome(StringBuffer a) {
		if(a.toString().equals(a.reverse().toString())) {
			return true;
		}else {
			return false;
			  }
	}
	
	
	public static boolean checkIfAreEqual(String a, String b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}

}

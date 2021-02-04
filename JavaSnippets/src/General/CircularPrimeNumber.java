package General;

public class CircularPrimeNumber {
	
	static boolean checkCircular(int N) 
	{ 
	    // Count digits. 
	    int count = 0;
	    int temp = N; 
	    while (temp>0) { 
	        count++; 
	        temp /= 10; 
	    } 
	  
	    int num = N; 
	    while (isPrime(num)) { 
	  
	        // Following three lines generate the next 
	        // circular permutation of a number. We move 
	        // last digit to first position. 
	        int rem = num % 10; 
	        int div = num / 10; 
	        num = (int)((Math.pow(10, count - 1)) * rem) 
                    + div; 
	  
	        // If all the permutations are checked and 
	        // we obtain original number exit from loop. 
	        if (num == N) 
	            return true; 
	    } 
	  
	    return false; 
	} 
	
	static boolean isPrime(int n) 
	{ 
	    // Corner cases 
	    if (n <= 1) 
	        return false; 
	    if (n <= 3) 
	        return true; 
	  
	    // This is checked so that we can skip 
	    // middle five numbers in below loop 
	    if (n % 2 == 0 || n % 3 == 0) 
	        return false; 
	  
	    for (int i = 5; i * i <= n; i = i + 6) 
	        if (n % i == 0 || n % (i + 2) == 0) 
	            return false; 
	  
	    return true; 
	} 

	public static void main(String[] args) {
		
		 int N = 311; 
	        if (checkCircular(N)) 
	        System.out.println("Yes"); 
	        else
	        System.out.println("No"); 

	}

}

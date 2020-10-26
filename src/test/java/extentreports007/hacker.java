package extentreports007;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class hacker {
	
		// Returns GCD of i and j 
	    static int gcd(int i, int j) 
	    { 
	        if (i == j) 
	            return i; 
	  
	        if (i > j) 
	            return gcd(i - j, j); 
	        return gcd(i, j - i); 
	    } 
	  
	    // Returns true if it is possble to go to (a, b) 
	    // from (x, y) 
	    static boolean ispossible(int x, int y, int a, int b) 
	    { 
	  
	        // Find absolute values of all as 
	        // sign doesn't matter. 
	        x = Math.abs(x); 
	        y = Math.abs(y); 
	        a = Math.abs(a); 
	        b = Math.abs(b); 
	  
	        // If gcd is equal then it is possible to reach. 
	        // Else not possible. 
	        return (gcd(x, y) == gcd(a, b)); 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) throws IOException 
	    { 
	    	
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter wr = new PrintWriter(System.out);
	        int T = Integer.parseInt(br.readLine().trim());
	        for(int t_i=0; t_i<T; t_i++)
	        {
	            String[] str = br.readLine().split(" ");
	            long x = Long.parseLong(str[0]);
	            long y = Long.parseLong(str[1]);

	            String out_ = solve(y, x);
	            System.out.println(out_);
	         }

	         wr.close();
	         br.close();
	  
	        // Converting coordinate into positive integer 
	        int x = 35, y = 15; 
	        int a = 20, b = 25; 
	        if (ispossible(x, y, a, b)) 
	            System.out.print("Yes"); 
	        else
	            System.out.print("No"); 
	    } 
	    
	    static String solve(long y, long x){
			
	    	
	    	
	    	return null;
	        // Write your code here
	        
	    }
	}



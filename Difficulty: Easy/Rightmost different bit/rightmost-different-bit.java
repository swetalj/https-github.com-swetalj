//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        // input number of testcases
        int t = sc.nextInt();
        int m, n;
        while (t-- > 0) {
            Solution obj = new Solution();
            // input m and n
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println(obj.posOfRightMostDiffBit(m, n));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {

        // Your code here
        
        // Your code here  
        int cnt=1;
        while(m>0 || n>0){
            int rem1=m%2;
            int rem2=n%2;
            if(rem1!=rem2)return cnt;
            m/=2;
            n/=2;
            cnt++;
        }
        return -1;
  
    }
}

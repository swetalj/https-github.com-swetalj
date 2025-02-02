//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.trailingZeroes(N);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static int trailingZeroes(int n) {
        
        // for(int i = 0;i<n;i++){
        //     int fact = 1;
        //     fact = fact*i;
        //     if(fact)
            
        int ans = 0;
        int demo = 5;
        
        while (demo<=n)
        {
            
            ans+= n/demo;
            
            demo = demo * 5;
        }            
            
            return ans;
            
        
        // Write your code here
    }
}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            int ans = ob.maximumSumSubarray(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// class Solution {
//     public int maximumSumSubarray(int[] arr, int k) {
//         // Code here
        
//         int mx = 0;
//         int sum = 0;
//         int n = arr.length;
//         for(int i = 0;i<k;i++)
//         {
//             sum+=arr[i];
            
//         }
//         mx =sum;
//         for(int i = k;i<n;i++)
//         {
//             sum = arr[i]-arr[i-k];
//             if(sum>mx)
//             {
//                 mx = sum;
//             }
//         }
//         return mx;
//     }
// }



class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int mx = 0;
        int sum = 0;
        int n = arr.length;

        // Compute the sum of the first `k` elements
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        mx = sum;

        // Use sliding window to compute max sum of any k-length subarray
        for (int i = k; i < n; i++) {
            sum += arr[i] - arr[i - k]; // Add new element, remove old one
            mx = Math.max(mx, sum);
        }

        return mx;
    }
}

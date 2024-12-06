//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().missingNumber(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int arr[]) {

        // Your Code Here
      	int n = arr.length + 1;
         for(int i = 1; i<=n; i++){
             int found = 0;
             for(int j = 0; j<n-1; j++){
                 if(arr[j] == i){
                     found = 1;
                 }
             }
             
             if(found == 0){
                 return i;
             }
         }
         
         return 0;
    }

}
//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s, patt;
            s = sc.next();
            patt = sc.next();

            Solution ob = new Solution();

            ArrayList<Integer> res = ob.search(patt, s);
            if (res.size() == 0)
                System.out.print("[]");
            else {
                for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        
        ArrayList<Integer> foundPatternList = new ArrayList<>();
        if(txt == null || txt.isEmpty() || pat.length() > txt.length())
            return foundPatternList;
        int index = txt.indexOf(pat);
        while(index != -1) {
            foundPatternList.add(index);
            index = txt.indexOf(pat, index+1);
        }
        return foundPatternList;
    }
}
    
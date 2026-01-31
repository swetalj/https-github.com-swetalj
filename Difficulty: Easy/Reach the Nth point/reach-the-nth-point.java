// User function Template for Java

class Solution {
    public int nthPoint(int n) {
        // Code here
        int x1 = 1;
        int x2 = 2;
        int sum = 0;
        if(n == 1 || n == 2){
            return n;
        }
        else{
            for(int  i=3; i<=n; i++){
                sum = (x1+x2)%1000000007;
                x1 = x2;
                x2 = sum;
            }
        }
        return sum%1000000007; 
        
        
    }
}
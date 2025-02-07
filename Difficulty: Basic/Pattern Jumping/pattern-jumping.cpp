//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution {
  public:
    string canJump(long long N) {
        
       
        if(N==1){
            return "True";
        }
            long long ans=1;
       while(N>ans){
           ans+=ans;
       }
       if(ans==N){
           return "True";
       }
       else{
           return "False";
       }
    }


        // code here
    
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N;
        
        cin>>N;

        Solution ob;
        cout << ob.canJump(N) << endl;
    
cout << "~" << "\n";
}
    return 0;
}
// } Driver Code Ends
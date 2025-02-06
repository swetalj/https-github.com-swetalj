#User function Template for python3

class Solution:
    def nCr(self, n, r):
        if r>n:
            return 0
        n_fact=self.factorial(n)
        r_fact=self.factorial(r)
        nr_fact=self.factorial(n-r)
        return (n_fact//(r_fact*nr_fact))%(10**9+7)
    def factorial(self,s):
        f=1
        while s>1:
            f=f*s
            s-=1
        return(f)
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())
        r = int(input())
        ob = Solution()
        print(ob.nCr(n, r))
# } Driver Code Ends
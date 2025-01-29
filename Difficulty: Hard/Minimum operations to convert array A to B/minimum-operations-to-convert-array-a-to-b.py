#User function Template for python3

import bisect
class Solution:

    def minInsAndDel(self,a, b, n, m):
        b_set = set(b)
        lis = []
        for i in range(n):
            if a[i] in b_set:
                idx = bisect.bisect_left(lis, a[i])
                if idx == len(lis):
                    lis.append(a[i])
                else:
                    lis[idx] = a[i]
        return n + m - 2 * len(lis)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N,M=map(int,input().split())
        A=list(map(int,input().split()))
        B=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.minInsAndDel(A,B,N,M))
        print("~")
# } Driver Code Ends
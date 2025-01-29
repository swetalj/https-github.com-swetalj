#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3

class Solution:
    def minCandy(self,arr):
        # Code here
        # N = []
        N = len(arr)
        if N == 0:
            return 0
        c = [1] * N
        for i in range(1, N):
            if arr[i] > arr[i - 1]:
                c[i] = c[i - 1] + 1
        for i in range(N - 2, -1, -1):
            if arr[i] > arr[i + 1]:
                c[i] = max(c[i], c[i + 1] + 1)
        return sum(c)

#{ 
 # Driver Code Starts.
if __name__ == '__main__': 
    t = int(input())
    for _ in range (t):
        arr = list(map(int, input().split()))
        ob = Solution()
        res = ob.minCandy(arr)
        print(res)
        print("~")
# } Driver Code Ends
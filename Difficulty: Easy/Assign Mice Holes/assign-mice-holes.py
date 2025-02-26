#User function Template for python3

class Solution:
    def assignMiceHoles(self, N , M , H):
    # def assignMiceToHoles(mice, holes):
    # Step 1: Sort both arrays
        M.sort()
        H.sort()
        
        # Step 2: Compute the maximum difference between assigned pairs
        max_time = 0
        for i in range(len(M)):
            max_time = max(max_time, abs(M[i] - H[i]))
        
        return max_time

# Example Test Case
# mice_positions = [4, -4, 2]
# hole_positions = [4, 0, 5]

# result = assignMiceToHoles(mice_positions, hole_positions)
# print("Minimum time required:", result)

#         # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N=int(input())
        M=list(map(int,input().split()))
        H=list(map(int,input().split()))
        
        ob = Solution()
        print(ob.assignMiceHoles(N,M,H))
        print("~")
# } Driver Code Ends
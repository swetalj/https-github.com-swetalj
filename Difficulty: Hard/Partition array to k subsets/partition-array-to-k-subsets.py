#User function Template for python3

class Solution:
    def __init__(self):
        self.target_sum = None

    def findPartitions(self, arr, k, visited, target_sum, ind):
        if k == 0:
            return True
        
        if target_sum == 0:
            return self.findPartitions(arr, k-1, visited, self.target_sum, 0)
            
        for i in range(ind, len(arr)):
            if not visited[i] and target_sum - arr[i] >= 0:
                visited[i] = True
                if self.findPartitions(arr, k, visited, target_sum - arr[i], ind + 1):
                    return True
                visited[i] = False
                
        return False
            
        

    def isKPartitionPossible(self, arr, k):
        #code here
        t = sum(arr)
        if t%k != 0:
            return False
            
        self.target_sum = t//k
        visited = [False]*len(arr)
        ind = 0
        return self.findPartitions(arr, k, visited, self.target_sum, ind)


#{ 
 # Driver Code Starts
if __name__ == '__main__':
    tcs = int(input())
    for _ in range(tcs):
        arr = [int(x) for x in input().split()]
        k = int(input())
        if Solution().isKPartitionPossible(arr, k):
            print("true")
        else:
            print("false")
        print("~")

# } Driver Code Ends
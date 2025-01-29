#{ 
 # Driver Code Starts

# } Driver Code Ends
class Solution:
    # Function to sort an array of 0s, 1s, and 2s
    def sort012(self, arr):
        # code here
        start,curr,end=0,0,len(arr)-1
        while curr<=end:
            if arr[curr]==0:
                arr[curr],arr[start]=arr[start],arr[curr]
                curr+=1
                start+=1
            elif arr[curr]==2:
                arr[curr],arr[end]=arr[end],arr[curr]
                end-=1
            else:
                curr+=1
        

#{ 
 # Driver Code Starts.
def main():
    t = int(input().strip())  # Read the number of test cases
    ob = Solution()

    while t > 0:
        t -= 1
        arr = list(map(int,
                       input().strip().split())
                   )  # Read the array as space-separated integers
        ob.sort012(arr)  # Sort the array

        print(' '.join(map(str, arr)))  # Print the sorted array
        print("~")
        
if __name__ == "__main__":
    main()

# } Driver Code Ends
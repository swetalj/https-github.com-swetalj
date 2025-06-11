class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int a=0;
    	
    	int n = mat.length;
    	int b = n-1;
    	while(a<b)
    	{
    	    if(mat[a][b] == 1)
    	        a++;
    	    else
    	        b--;
    	}
    	
    	for(int i=0;i<n;i++){
    	    if((i!=a) && (mat[a][i] == 1||mat[i][a] == 0))
    	        return -1;
    	}
    	return a;
    }
}
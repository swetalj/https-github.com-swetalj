/*
public class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
}

*/
public class Solution {
    Node ans = null;
    Node temp = null;
    public void solve(Node root){
        if(root==null) return;
        solve(root.left);
        if(ans==null){
            ans = new Node(root.data);
            temp = ans;
        }
        else{
            Node a = temp;
            temp.right = new Node(root.data);
            temp = temp.right;
            temp.left = a;
        }
        solve(root.right);
    }
    public Node bToDLL(Node root) {
        // code here
        
        ans = null;
        temp = null;
        solve(root);
        return ans;
    
    }
}

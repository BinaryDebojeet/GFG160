class Solution {
        public static Node helper(int[] preorder, int prelow, int prehi, int[] inorder, int inlow, int inhi){

        if(prelow > prehi) return null;
        Node root = new Node(preorder[prelow]);
        int i = inlow;
        while(inorder[i]!=preorder[prelow]){
            i++;
        }
        int leftside = i - inlow;
        root.left = helper(preorder, prelow+1, prelow+leftside, inorder, inlow, i-1);
        root.right = helper(preorder, prelow+leftside+1, prehi, inorder, i+1, inhi);
        return root;

    }
    public static Node buildTree(int inorder[], int preorder[]) {
       int n = preorder.length;
        return helper(preorder, 0, n-1, inorder, 0, n-1);
    }
}
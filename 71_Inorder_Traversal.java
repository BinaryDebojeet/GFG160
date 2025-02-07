// class Solution {
    
//     public void helper(ArrayList<Integer> ans, Node root){
//         if(root==null) return;
//         helper(ans, root.left);
//         ans.add(root.data);
//         helper(ans, root.right);
//     }
//     ArrayList<Integer> inOrder(Node root) {
        
//         ArrayList<Integer> ans = new ArrayList<>();
//         helper(ans, root);
//         return ans;
//     }
// }
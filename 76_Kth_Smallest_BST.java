// class Solution {
//     int count = 0, result = -1;
    
//     public int kthSmallest(Node root, int k) {
//         inorder(root, k);
//         return result;
//     }
    
//     private void inorder(Node root, int k) {
//         if (root == null || count >= k) return;
        
//         inorder(root.left, k);
//         count++;
//         if (count == k) {
//             result = root.data;
//             return;
//         }
//         inorder(root.right, k);
//     }
// }

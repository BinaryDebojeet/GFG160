// class Solution {
//     int height(Node node) {
//         if(node==null || (node.left==null && node.right==null)) {
//             return 0;
//         }
//         return 1 + Math.max(height(node.right), height(node.left));
//     }
// }
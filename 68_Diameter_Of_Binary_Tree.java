// class Solution {
//     class TreeInfo {
//         int height;
//         int diameter;
//         TreeInfo(int height, int diameter) {
//             this.height = height;
//             this.diameter = diameter;
//         }
//     }

//     private TreeInfo diameterHelper(Node root) {
//         if (root == null) return new TreeInfo(0, 0);

//         TreeInfo left = diameterHelper(root.left);
//         TreeInfo right = diameterHelper(root.right);

//         int height = 1 + Math.max(left.height, right.height);
//         int diameter = Math.max(left.height + right.height, Math.max(left.diameter, right.diameter));

//         return new TreeInfo(height, diameter);
//     }

//     public int diameter(Node root) {
//         return diameterHelper(root).diameter;
//     }
// }
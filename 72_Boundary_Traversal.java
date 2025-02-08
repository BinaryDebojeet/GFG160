// class Solution {
//     ArrayList<Integer> boundaryTraversal(Node node) {
//         ArrayList<Integer> result = new ArrayList<>();
//         if (node == null) return result;
//         result.add(node.data);
//         if(node.left==null&&node.right==null)
//         {
//             return result;
//         }
        
//         left(node.left, result);
        
//         bottom(node, result);

//         ArrayList<Integer> rightBoundary = new ArrayList<>();
//         right(node.right, rightBoundary);
//         Collections.reverse(rightBoundary);

//         result.addAll(rightBoundary);
//         return result;
//     }

//     public void left(Node root, ArrayList<Integer> result) {
//         while (root != null) {
//             if (!isLeaf(root)) result.add(root.data);
//             root = (root.left != null) ? root.left : root.right;
//         }
//     }

//     public void right(Node root, ArrayList<Integer> result) {
//         while (root != null) {
//             if (!isLeaf(root)) result.add(root.data);
//             root = (root.right != null) ? root.right : root.left;
//         }
//     }

//     public void bottom(Node root, ArrayList<Integer> result) {
//         if (root == null) return;
//         if (isLeaf(root)) result.add(root.data);
//         bottom(root.left, result);
//         bottom(root.right, result);
//     }

//     private boolean isLeaf(Node node) {
//         return node.left == null && node.right == null;
//     }
// }

// class Solution {
//     public static int height(Node root){
//        if(root==null || (root.left ==null && root.right == null)) return 0;
//        return 1 + Math.max(height(root.left), height(root.right));
//    }
//        public void nthLevel(Node root, int n, ArrayList<Integer> arr){
//        if(root==null) return;
//        if(n==1) arr.add(root.data);
//        nthLevel(root.left, n-1, arr);
//        nthLevel(root.right, n-1, arr);
//    }
//    public ArrayList<ArrayList<Integer>> levelOrder(Node root) {
       
//         ArrayList<ArrayList<Integer>> ans  = new ArrayList<>();
//        int level = height(root) + 1;
//        if(root==null) return ans;
//        for(int i=1; i<=level; i++){
//            ArrayList<Integer> arr = new ArrayList<>();
//                nthLevel(root, i,arr);        
//            ans.add(arr);
//        } 
//        return ans;
//    }
// }
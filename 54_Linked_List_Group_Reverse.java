// class Solution {
//     public static Node reverseKGroup(Node head, int k) {
        
//         if(head == null) return null;
//         int t = k;
        
//         Node prev = null;
//         Node curr = head;
//         Node nextNode = null;
        
//         while(curr != null && t > 0){
//             nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//             t--;
//         }
//         head.next = reverseKGroup(curr, k);
//         return prev;
//     }
     
// }
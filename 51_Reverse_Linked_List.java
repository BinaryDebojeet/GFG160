// class Solution {
//     Node reverseList(Node head) {
        
//         Node prev = null;
//         Node curr = head;
//         Node nextNode = null;
        
//         while(curr != null){
//             nextNode = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//         }
//         return prev;
//     }
// }
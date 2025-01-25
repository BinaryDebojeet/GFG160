// class Solution {
//     public static boolean detectLoop(Node head) {
        
//         Node slow = head;
//         Node fast = head;
        
//         if(head == null || head.next == null ) return false;
        
//         while(fast!=null){
           
//            if(fast.next==null){
//                return false;
//            }
//            fast = fast.next.next;
//            if(slow==null){
//                return false;
//            }
//            slow = slow.next;
//            if(slow == fast){
//                return true;
//            }
//         }
        
//         return false;
//     }
// }

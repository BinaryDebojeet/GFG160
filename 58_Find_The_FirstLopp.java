// class Solution {
//     public static Node findFirstNode(Node head) {
//         Node slow = head;
//         Node fast = head;
        
//         Node temp = new Node(-1);

//         if (head == null || head.next == null) {
//             return temp; 
//         }

//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if (slow == fast) {
//                 break;
//             }
//         }
        
//         if (fast == null || fast.next == null) {
//             return temp;
//         }

//         slow = head;
//         while (slow != fast) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         return slow; 
//     }
// }
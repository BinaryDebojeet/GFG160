// class Solution {
//     Node sortedMerge(Node head1, Node head2) {
        
//         Node temp = new Node(1);
//         Node head = temp;
//         Node first = head1;
//         Node second = head2;
        
//         while(first!=null && second!=null){
            
//             if(first.data <= second.data){
//                 temp.next = first;
//                 first = first.next;
//             }
//             else{
//                 temp.next = second;
//                 second = second.next;
//             }
//             temp = temp.next;
//         }
        
//         while(first!=null){
//             temp.next = first;
//             first = first.next;
//             temp = temp.next;
//         }
//         while(second!=null){
//             temp.next = second;
//             second = second.next;
//             temp = temp.next;
//         }
//         return head.next;
//     }
// }
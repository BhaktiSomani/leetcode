/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode end=head;
        int count =0;
        while(end!=null){
            list.add(end.val);
            end=end.next;
            count++;
        }
        int i=0;
        System.out.println(count);
        while(i<count){
            if(list.get(i)==list.get(count-1)){
                i++;
                count--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
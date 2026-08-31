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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int idx = 1, mnd = Integer.MAX_VALUE, first = -1, last = -1;
        ListNode prev = head, curr = head.next;

        while(curr!=null && curr.next!=null){

            //update answers if found minima or maxima
            if(curr.val > prev.val && curr.val > curr.next.val ||
               curr.val < prev.val && curr.val < curr.next.val){
                if(first==-1){
                    first = idx;
                }
                else{
                    mnd = Math.min(mnd, idx-last);
                }
                last = idx;
            }

            //update nodes
            prev = curr;
            curr = curr.next;
            idx++;
        }

        return new int[]{mnd==Integer.MAX_VALUE?-1:mnd, last-first==0?-1 : last-first};
    }
}
//curr will be 1, min = -1, max = -1, first = -1, last = -1; these will track indexes
//prevPrev = null, prev = null // these will track nodes

// 1 -> 
//c = 5
//p = -1
//pp= -1

/**
if prev is not -1 and next node is not null then check about maxima and minima 
if found anything :
if(min = -1)update min
else:
   before updating update minDistance if distance between max and curr is less than min 

 */
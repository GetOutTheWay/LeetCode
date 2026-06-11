// Last updated: 6/11/2026, 12:57:14 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        // Dummy head to simplify result list construction
14        ListNode dummyHead = new ListNode(0);
15        ListNode current = dummyHead;
16        int carry = 0;
17
18        // Traverse both lists while at least one has nodes or carry is non-zero
19        while (l1 != null || l2 != null || carry != 0) {
20            int sum = carry; // start with carry from previous addition
21
22            if (l1 != null) {
23                sum += l1.val;
24                l1 = l1.next;
25            }
26            if (l2 != null) {
27                sum += l2.val;
28                l2 = l2.next;
29            }
30
31            // Create new node with the digit part and update carry
32            current.next = new ListNode(sum % 10);
33            carry = sum / 10;
34            current = current.next;
35        }
36
37        // Return the next of dummy head (actual head of result list)
38        return dummyHead.next;
39    }
40}
41
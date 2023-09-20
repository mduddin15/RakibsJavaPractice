package Recursion.SwapNodes;

public class SwapPairsInLinkedList {

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode nodeList = new ListNode(1);
        nodeList.next = new ListNode(2);
        nodeList.next.next = new ListNode(3);
        nodeList.next.next.next = new ListNode(4);

        System.out.println("Input:");
        printLinkedList(nodeList);

        ListNode swappedList = swapPairs(nodeList);

        System.out.println("Output:");
        printLinkedList(swappedList);
    }
}


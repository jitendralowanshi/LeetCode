package LinkedList;

public class _0019_RemoveNthNodeFromLast {
    static Node head;
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeNodefromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i=1; i<=n; i++) {
            fast = fast.next;
        }
//        if head delet krna pad jay ya nth node head ho tab
        if(fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }



    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);

        Node ans = removeNodefromEnd(a, 1);
        display(ans);

    }
}

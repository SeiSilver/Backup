package Core;

public class CallLinkedList {
    public Node head;
    public Node tail;

    public CallLinkedList(Node head, Node tail) {
	this.head = head;
	this.tail = tail;
    }

    public CallLinkedList() {
	this.head = null;
	this.tail = null;
    }

    boolean isEmpty() {
	return (head == null);
    }

    void clear() {
	head = tail = null;
    }

    void traverse() {
	Node p = head;
	System.out.print("LinkedList is : ");
	while (p != null) {
	    System.out.print(p.data + " ");
	    p = p.next;
	}
	System.out.println();
    }

    public void addFirst(int x) {
	Node p = new Node(x);
	if (isEmpty()) {
	    head = tail = p;

	} else {
	    p.next = head;
	    head = p;
	}
    }

    public void addLast(int x) {
	Node p = new Node(x);
	if (isEmpty()) {
	    head = tail = p;
	} else {
	    Node temp = head;
	    while (temp.next != null) {
		temp = temp.next;
	    }
	    tail = temp;
	    temp.next = p;
	    p.next = null;
	}
    }

//    public void addAfterAt(int x) {
//	Node p = new 
//    }

    public int deleteFirst() {
	if (isEmpty()) { return Integer.MIN_VALUE; }
	Node p = head;
	head = head.next;
	return p.data;
    }

    public int deleteLast() {
	if (isEmpty()) { return Integer.MIN_VALUE; }
	Node p = head;
	Node q = tail;

	Node previouseNode = new Node();

	while (p.next != null) {
	    previouseNode = p;
	    p = p.next;
	}
	tail = previouseNode;
	previouseNode.next = null;
	return q.data;
    }

    public void dele(int x) {
	if (isEmpty()) {
	    System.out.println("The given list is empty");
	    return;
	}

	Node p = head;
	Node pre = new Node();
	while (p.data != x && p.next != null) {
	    pre = p;
	    p = p.next;
	}

	pre.next = p.next;

    }

}

package MyLinkedList;

public class Node {
    public String data;
    public Node ptr;

    public Node(String data) {
	super();
	this.data = data;
	this.ptr = null;
    }

    public Node() {
	this.ptr = null;
    }

    public String getData() {
	return data;
    }

    public void setData(String data) {
	this.data = data;
    }

}
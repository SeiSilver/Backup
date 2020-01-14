package Core;

public class Main {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	String[] arr = { "Jack", "Queen", "King", "Ace" };
//	Stack t = new Stack(arr.length);
//	ArrayListStack t = new ArrayListStack();
	LinkedListStack t = new LinkedListStack();
	for (int i = 0; i < arr.length; i++) {
	    t.push(arr[i]);
	}
	t.display();
	for (int i = 0; i < arr.length; i++) {
	    System.out.print(t.pop() + " ");
	}

    }

}

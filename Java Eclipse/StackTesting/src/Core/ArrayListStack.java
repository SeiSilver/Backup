package Core;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<String> list = new ArrayList<String>();

    public ArrayListStack() {

    }

    public void push(String value) {
	list.add(value);
	count++;
    }

    public void display() {
	System.out.print("Array List: ");
//	for (String i : list) {
//	    System.out.println(i);
//	}
	System.out.println(list);
    }

    private int count = -1;

    public String peek() {

	return list.get(count++);
    }

    public String pop() {
	count--;
	return list.get(count + 1);
    }

    boolean isEmpty() {
	return list.isEmpty();
    }
}

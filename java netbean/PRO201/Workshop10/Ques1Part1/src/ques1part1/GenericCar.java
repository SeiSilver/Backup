// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1part1;

import java.util.LinkedList;

public class GenericCar<T> {
    private T obj;
    private LinkedList<T> a = new LinkedList<T>();

    public GenericCar() {
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void add() {
        a.add(obj);
    }

    public void display() {
        for (T i : a) {
            System.out.println(i);
        }
    }

    public int getSize() {
        return a.size();
    }

    public boolean checkEmpty() {
        for (T i : a) {
            if (!i.toString().isEmpty())
                return false;
        }
        return true;
    }

    public void delete(int pos) {
        a.remove(pos);
    }
}

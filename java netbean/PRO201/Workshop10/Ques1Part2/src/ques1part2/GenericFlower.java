// Name: Pham Duy Dat
// Class: SE140191
// ID: DE140191
package ques1part2;

import java.util.LinkedList;

public class GenericFlower<T> {
    private T obj;
    private LinkedList<T> a = new LinkedList<T>();

    public GenericFlower() {
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

    // public void sort() {
    // Collections.sort((LinkedList<Flower>) a);
    // }

    public boolean search(Flower s) {
        for (T i : a) {
            if (i.toString().equalsIgnoreCase(s.toString()))
                return true;
        }
        return false;
    }

    public void delete(int pos) {
        a.remove(pos);
    }

    public LinkedList<T> getA() {
        return a;
    }

    public void setA(LinkedList<T> a) {
        this.a = a;
    }
}

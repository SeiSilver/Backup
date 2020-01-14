package question1;

@SuppressWarnings("serial") // tat warning thieu serial cua java
public class IllegalTriangleException extends Exception {

    String s = "";

    public IllegalTriangleException(String string) {
        s = string;
    }

    @Override
    public String toString() {
        return s;
    }

}

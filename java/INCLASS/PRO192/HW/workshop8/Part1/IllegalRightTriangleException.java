package HW.workshop8.Part1;

@SuppressWarnings("serial")
public class IllegalRightTriangleException extends Exception {

    String s = "";

    public IllegalRightTriangleException(String string) {
        s = string;
    }

    @Override
    public String toString() {
        return s;
    }

}

package testvn;

public class hello {
  public static void main(String[] args) {
    System.out.println("Hello Wellcome to Java!");
    cls();
  }

  public static void cls() {
    try {
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    } catch (Exception E) {
      System.out.println(E);
    }
  }

}

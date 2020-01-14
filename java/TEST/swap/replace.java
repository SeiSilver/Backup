package swap;

public class replace {

    public static void main(String[] args) {
        // Initialising String
        String str = new String("Welcome to CodeLearn");
        System.out.println(str);

        // Using replace to replace characters
        System.out.print("After replacing all e with E: ");
        System.out.println(str.replace('e', 'E'));

        // Using replace to replace characters
        System.out.print("After replacing all e with D: ");
        System.out.println(str.replace('e', 'D'));

        // Initialising String
        String test = new String("Welcome to CodeLearn");

        // Original string
        System.out.print("Original String: ");
        System.out.println(test);

        // Using replaceAll to replace regex with replace_str
        System.out.print("After replacing regex with replace_str: ");
        System.out.println(test.replaceAll("to", "to FPT Software"));
    }
}
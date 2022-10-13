import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("First string: ");
        String str1 = scan.nextLine();
        System.out.print("Second string: ");
        String str2 = scan.nextLine();

        int len = str1.length();
        System.out.printf("Length: %s\n", len);
        System.out.printf("First half: %s\n", str1.substring(0, str1.length()/2));
        System.out.printf("Second half: %s\n", str1.substring(str1.length()/2));

        if (str1.length() > str2.length()) {
            System.out.printf("%s is longer than %s.\n", str1, str2);
        } else if (str1.length() < str2.length()) {
            System.out.printf("%s is longer than %s.\n", str2, str1);
        } else {
            System.out.println("Both string have the same length");
        }

        if (str1.compareTo(str2) < 0) {
            System.out.printf("%s is first.\n", str1);
        } else if (str1.compareTo(str2) > 0) {
            System.out.printf("%s is first.\n", str2);
        } else {
            System.out.println("The strings are identical.");
        }

        if (str1.contains(str2)) {
            System.out.printf("%s is found in %s at index %s.", str2, str1, str1.indexOf(str2));
        } else {
            System.out.printf("%s is not found in %s", str2, str1);
        }
    }
}

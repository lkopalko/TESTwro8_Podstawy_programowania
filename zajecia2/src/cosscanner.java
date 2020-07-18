
import java.util.Scanner;

public class cosscanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        int b = scanner.nextInt();
        char c = scanner.next().charAt(0);

        boolean one = a != b;
        boolean two = b <= c;
        System.out.println(one);
        System.out.println(two);
        System.out.println("a == b" + (a == b));
    }
}

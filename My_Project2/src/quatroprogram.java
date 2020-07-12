import java.util.Scanner;

public class quatroprogram {
    public static void main(String[] args) {
        System.out.println("talala");
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj ciag znakow");
        String string = scanner.next();
        System.out.println("podaj pozycje znaku");
        int index = scanner.nextInt();
        System.out.println("ciag" + string + "zawiera" + string.charAt(index) + "na pozycji" + index);


    }


}

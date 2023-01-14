import java.util.Locale;
import java.util.Scanner;

public class Exercise20 {

    int num = 15;
    String result = Integer.toHexString(num).toUpperCase(Locale.ROOT);

    public static void main(String[] args) {
        Exercise20 exercise20 = new Exercise20();
        System.out.println("Hexadecimal number is : " + exercise20.result);

        Scanner scanner1 = new Scanner(System.in);
        int num = scanner1.nextInt();
        int dec = 0;
        if (num < 10 && num > 0) {
            dec = num + 48;
        } else {
            dec = num + 55;
        }
        char intToChar = (char) dec;
        System.out.println("Hexadecimal number is : " + intToChar);
    }


}

import java.util.Scanner;

public class Exercise41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a char: ");
        int num = scanner.next().charAt(0);
        System.out.println("The ASCII value of " + (char) num + " is " + num);

    }


}

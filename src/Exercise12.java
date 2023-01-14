import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {
        System.out.println('\n' + "Exercise12:");
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int x = 3;
        int sum = 0;
        while (i <= x) {
            System.out.println("Input the number " + i + " : ");
            int num = scanner.nextInt();
            i++;
            sum += num;
        }
        System.out.println("Average is: " + (sum / x));
    }

}

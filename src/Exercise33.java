import java.util.Scanner;

public class Exercise33 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number = scanner.nextInt();

        int num = 357;
        int rest = 0;
        int sum = 0;
        int sumNumber = 0;

        while (num > 0) {
            rest = num % 10;
            num = num / 10;
            sum += rest;
        }

        while (number>0){
            int restNumber=number%10;
            number=number/10;
            sumNumber+=restNumber;
        }

        System.out.println(sum);
        System.out.println(sumNumber);

    }
}

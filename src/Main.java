import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercise8:");
        Exercise8 exercise8 = new Exercise8();
        System.out.println(exercise8.java);

        System.out.println('\n' + "Exercise9:");
        Exercise9 exercise9 = new Exercise9();
        System.out.println("Fist number: " + exercise9.num1);
        System.out.println("Second number: " + exercise9.num2);
        System.out.println("Third number: " + exercise9.num3);
        System.out.println("Forth number: " + exercise9.num4);
        System.out.println("Count: " + exercise9.count);

        System.out.println('\n' + "Exercise10:");
        Exercise10 exercise10 = new Exercise10();
        System.out.println("Count: " + exercise10.count);

        System.out.println('\n' + "Exercise11:");
        Exercise11 exercise11 = new Exercise11();
        System.out.println("Perimeter is: " + exercise11.perimeter);
        System.out.println("Area is: " + exercise11.area);

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

        System.out.println('\n' + "Exercise13:");
        Exercise13 exercise13=new Exercise13();

        System.out.println("Perimeter is: " + exercise13.perimeter);
        System.out.println("Area is: " + exercise13.area);

    }
}

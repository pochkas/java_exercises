import java.util.Scanner;

public class Exercise37 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


        char[] array=str.toCharArray();
        for(int i= array.length-1; i>=0; i--){
            System.out.print(array[i]);
        }

    }
}

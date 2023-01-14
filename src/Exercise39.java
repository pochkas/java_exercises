import java.util.Arrays;

public class Exercise39 {
    public static void main(String[] args) {

        int counter=0;
        for (int a = 1; a <= 4; a++) {
            for (int s = 1; s <= 4;s++) {
                for (int b = 1; b <= 4; b++) {
                    if(a!=s && a!=b && s!=b) {
                        counter++;
                        System.out.println(a + "" + s + "" + b);

                    }
                }
            }
        }
        System.out.println(counter);


    }
}

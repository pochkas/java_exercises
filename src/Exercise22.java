public class Exercise22 {


    public static void main(String[] args) {
        long binNum = 100;
        long bin;
        int j=1;
        long decNam=0;
        System.out.println('\n' + "Exercise22:");

        while (binNum!=0) {
            bin = binNum % 10;
            decNam=decNam+bin*j;
            j=j*2;
            binNum=binNum/10;

        }


        System.out.println("Decimal number is: " + decNam);

        String num="100";
        int decimal=Integer.parseInt(num,2);
        System.out.println("Decimal number is: " + decimal);
    }
}

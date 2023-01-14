public class Exercise38 {
    public static void main(String[] args) {

        String str = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

        char[] array = str.toCharArray();

        int num = 0;
        int space = 0;
        int letter = 0;
        int ch = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= 65 && array[i] <= 90 || array[i] >= 97 && array[i] <= 122) {
                letter++;
            } else if (array[i] == ' ') {
                space++;
            } else if (array[i] >= 48 && array[i] <= 57) {
                num++;
            } else {
                ch++;
            }
        }

        System.out.println(letter);
        System.out.println(space);
        System.out.println(num);
        System.out.println(ch);

        String str2 = "jdfghjksdfh dfyghsdfgsdfg   76575 jkklj76hjk!!!!hj 45";
        int num2 = 0;
        int space2 = 0;
        int letter2 = 0;
        int ch2 = 0;
        char[] array2 = str2.toCharArray();

        for (int i = 0; i < array2.length - 1; i++) {
            if (Character.isLetter(array2[i])) {
                letter2++;
            } else if (Character.isSpaceChar(array2[i])) {
                space2++;
            } else if (Character.isDigit(array2[i])) {
                num2++;
            } else {
                ch2++;
            }
        }

        System.out.println(letter2);
        System.out.println(space2);
        System.out.println(num2);
        System.out.println(ch2);
    }
}

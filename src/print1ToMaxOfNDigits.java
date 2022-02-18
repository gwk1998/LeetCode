/**
 * 打印从1到最大的n位数
 */
public class print1ToMaxOfNDigits {

    public static void main(String[] args) {
        printnnn(3);
//            char[] testChar = new char[3];
//            testChar = new char[] {'0', '0', '1'};
//            System.out.println(testChar[2]);
//        print1ToMaxOfNDigits(3);
    }

    public static void print1ToMaxOfNDigits(int n) {
        if (n <= 0)
            return;
        char[] number = new char[n];
        print1ToMaxOfNDigits(number, 0);
    }

    private static void print1ToMaxOfNDigits(char[] number, int digit) {
        if (digit == number.length) {
            printNumber(number);
            return;
        }
        //多次循环赋值打印
        for (int i = 0; i < 10; i++) {
            number[digit] = (char) (i + '0');
            print1ToMaxOfNDigits(number, digit + 1);
        }
    }

    private static void printNumber(char[] number) {
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }

    /*****************************************************************
     *
     *打印n位数
     * @param n
     */
    public static void printnnn(int n) {
        if(n <= 0) {
            return;
        }
        char[] number = new char[n];
        print1toMaxDigit(number, 0);
    }

    private static void print1toMaxDigit(char[] number, int digit) {
        if (number.length == digit) {
            printNumber22(number);
            return;
        }
        for(int i = 0; i < 10; i++) {
            //给第一位赋值为'0',然后最后一位，然后开始回溯打印
            number[digit] = (char)(i + '0');
            print1toMaxDigit(number, digit + 1);
        }
    }

    private static void printNumber22(char[] number) {
        int index = 0;
        //找到首个不为'0'的索引
        while (index < number.length && number[index] == '0')
            index++;
        // 循环字符数组
        while (index < number.length)
            System.out.print(number[index++]);
        System.out.println();
    }
}

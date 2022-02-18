import java.util.Arrays;

/**
 * 在一个字符串中找到第一个只出现一次的字符，并返回它的位置。字符串只包含 ASCII 码字符。
 */
public class FindFirstPosition {
    public static void main(String[] args) {
        String str = "aabbcff";
        System.out.println(FirstNotRepeatingChar(str));
    }

    public static int FirstNotRepeatingChar(String str) {
        int[] cnts = new int[128];
        for (int i = 0; i < str.length(); i++)
            cnts[str.charAt(i)]++;
        for (int i = 0; i < str.length(); i++)
            if (cnts[str.charAt(i)] == 1){
                return i;
            }

        return -1;
    }
}

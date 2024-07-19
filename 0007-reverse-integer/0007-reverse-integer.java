import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.print(reverse(x));
    }

    public static int reverse(int x) {
        int reversed = 0;
        while (x != 0) {
            int last_digit = x % 10;
            x = x / 10;
            
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && last_digit > 7)) {
                return 0; 
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && last_digit < -8)) {
                return 0; 
            }
            
            reversed = reversed * 10 + last_digit;
        }
        return reversed;
    }
}

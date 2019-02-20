/**
 * Created by singhgu on 12/3/2018.
 */
public class ReverseInteger7 {
    public static int reverse(int x) {
        boolean flag = false;
        int rev = 0;

        if(x < 0){
            x = 0 - x;
            flag = true;
        }

        while(x != 0){
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }

        if(flag){
            rev = 0 - rev;
        }

        return rev;
    }

    public static void main(String[] args)
    {
        System.out.println(reverse(1534236469));
    }

}

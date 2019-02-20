/**
 * Created by singhgu on 12/3/2018.
 */
public class palindrome9 {
    public static boolean isPalindrome(int x) {

        if(x < 0)
            return false;

        String str = Integer.toString(x);

        if(str.length() / 2 == 0)
        {
            for(int i = 0, j = str.length()-1; i < str.length()/2 && j >= str.length()/2; i++,j--){
                if(str.charAt(i) == str.charAt(j))
                    continue;
                else
                    return false;
            }
        }
        else{
            for(int i = 0, j = str.length()-1; i < str.length()/2 && j > str.length()/2; i++,j--){
                if(str.charAt(i) == str.charAt(j))
                    continue;
                else
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(12921));
    }
}

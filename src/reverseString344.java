/**
 * Created by singhgu on 2/8/2019.
 */
public class reverseString344 {

    public static void reverseString(char[] s){
        char temp;
        for(int i = 0, j = s.length-1;i <s.length/2;i++,j--){
            temp = s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }

    public static void main(String[] args){reverseString(new char[]{'h','e','l','l'});}
}

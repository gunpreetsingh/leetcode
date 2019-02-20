/**
 * Created by singhgu on 2/6/2019.
 */
public class needleHaystack28 {

    public static int strStr(String haystack, String needle){
        if(needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args){System.out.println(strStr("aaaaa", "bba"));}
}

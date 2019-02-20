/**
 * Created by singhgu on 2/5/2019.
 */
public class longestCommonPrefix14 {

    public static String longestCommonPrefix(String[] strs){

        if(strs.length < 1 )
            return "";
        else if(strs.length == 1)
            return strs[0];

        int shortest = 0;
        int length = strs[0].length();

        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < length){
                length = strs[i].length();
                shortest = i;
            }
        }

        String substring = strs[shortest];

        for(int i =0; i<strs.length;i++){
            while(strs[i].indexOf(substring) !=0 ){
                substring = substring.substring(0, substring.length() - 1);
            }
        }
    return substring;
    }
    public static void main(String[] args)
    {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}

/**
 * Created by singhgu on 12/3/2018.
 */
public class JewelsAndStones771 {
    public static int numJewelsInStones(String J, String S) {

        if(S.length() == 0 || J.length() == 0)
            return 0;

        int count = 0;

        boolean[] jewels = new boolean[128];

        for(char c : J.toCharArray())
            jewels[c] = true;
        for(char c : S.toCharArray()){
            if(jewels[c] == true)
            count++;
        }


        return count;
    }

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}

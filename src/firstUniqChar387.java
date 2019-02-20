/**
 * Created by singhgu on 2/18/2019.
 */
public class firstUniqChar387 {
    public static int firstUniqChar(String s) {
        int[] arr = new int[128];
        for(char c :s.toCharArray()){
            arr[c] = arr[c] + 1;
        }
        for(int i =0; i< s.length(); i++){
            if(arr[s.charAt(i)] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.print(firstUniqChar("loveleetcode"));
    }
}

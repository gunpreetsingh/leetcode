import java.util.HashMap;
import java.util.Map;

/**
 * Created by singhgu on 2/5/2019.
 */
public class twosum1 {

    public static int[] twoSum(int[] arr, int target){
        int[] result = new int[2];
        Map<Integer, Integer> hmap= new HashMap<Integer,Integer>();

        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(target - arr[i])){
                result[1] = i;
                result[0] = hmap.get(target - arr[i]);
                return result;
            }
            hmap.put(arr[i], i);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = twoSum(new int[]{2,7,11,15},9);
        System.out.println(arr[0]+" " + arr[1]);
    }
}

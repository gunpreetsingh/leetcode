/**
 * Created by singhgu on 2/6/2019.
 */
public class removeElement27 {
    public static int removeElement(int[] nums, int val){
        int lastIndex = nums.length - 1;
        for(int i = 0; i<lastIndex + 1; i++){
            if(val == nums[i]){
                nums[i] = nums[lastIndex];
                lastIndex--;
                i--;
            }
        }
        return lastIndex+1;
    }

    public static void main(String[] args){
        System.out.println(removeElement(new int[]{3, 2, 3, 3}, 3));
    }
}

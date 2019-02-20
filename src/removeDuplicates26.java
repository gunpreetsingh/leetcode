/**
 * Created by singhgu on 2/6/2019.
 */
public class removeDuplicates26 {

    public static int removeDuplicates(int[] nums){
        if (nums.length==0) return 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }
        return j+1;
    }

    public static void main(String[] args){System.out.println(removeDuplicates(new int[]{1, 1, 2}));}
}

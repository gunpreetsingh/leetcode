/**
 * Created by singhgu on 2/8/2019.
 */
public class maximumSubarray53 {

    public static int maximumSubarray(int[] nums){
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for(int i = 1;i<nums.length;i++){
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar,maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String[] args){System.out.println(maximumSubarray(new int[]{-2, 1, -3,4,-1,2,1,-5,4}));}
}

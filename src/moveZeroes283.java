/**
 * Created by singhgu on 2/9/2019.
 */
public class moveZeroes283 {

    public static int[] moveZeroes(int[] nums){
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }
            print(nums);
        }
        return nums;
    }

    public static void print(int[] nums){
        for(int n: nums)
            System.out.print(n);
        System.out.println();
    }
    public static void main(String args[]){
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
